package com.example.demo.controller;

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

@RestController
@RequestMapping("/")
public class KakaotalkJoinController {

	@Autowired
	private KakaotalkJoinService kakaotalkJoinService;

	@PostMapping("kakaotalkJoin")
//	@PostMapping("kakaotalk")

	public Map kakatalkJoin(@RequestBody String kakaojson) throws JsonMappingException, JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		Map<String, Object> jsonMap = mapper.readValue(kakaojson, Map.class);

		Map<String, Object> properties = (Map) jsonMap.get("properties");

		Map<String, Object> kakao_account = (Map) jsonMap.get("kakao_account");

		JsonNode rootNode = mapper.readTree(kakaojson);

		String nickname = (String) properties.get("nickname");
		String email = (String) kakao_account.get("email");
		long id = rootNode.path("id").asLong();

		KakaotalkDTO dto = new KakaotalkDTO(id, email, nickname);

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
