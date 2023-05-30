package com.example.demo.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.KakaotalkDTO;
import com.example.demo.service.KakaotalkJoinService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class KakaotalkJoinController {

	@Autowired
	private KakaotalkJoinService kakaotalkJoinService;

	@PostMapping("kakaotalkJoin")
//	@PostMapping("kakaotalk")

	public Map kakatalkJoin(@RequestBody String kakaojson, HttpServletRequest request) throws JsonMappingException, JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		Map<String, Object> jsonMap = mapper.readValue(kakaojson, Map.class);

		Map<String, Object> properties = (Map) jsonMap.get("properties");

		Map<String, Object> kakao_account = (Map) jsonMap.get("kakao_account");

		JsonNode rootNode = mapper.readTree(kakaojson);

		String mem_name = (String) properties.get("nickname");
		String mem_email = (String) kakao_account.get("email");
		long mem_id = rootNode.path("id").asLong();

		
		ClientUtils clientUtils = new ClientUtils();
		String ip = clientUtils.getRemoteIP(request);
		
		DateAndTime dateAndTime = new DateAndTime();
		LocalDate nowDate = dateAndTime.nowDate();
		LocalTime nowTime = dateAndTime.nowTime();
		
		KakaotalkDTO dto = new KakaotalkDTO(0, mem_id, mem_email, mem_name, nowDate, nowTime, ip, null, null);

		Map<String, Object> result = new HashMap<String, Object>();

		try {
			kakaotalkJoinService.kakatalkJoin(dto);
			result.put("result", "success");
		} catch (Exception e) {
			result.put("result", "fail");
			e.printStackTrace();
		}

		return result;
	}

}
