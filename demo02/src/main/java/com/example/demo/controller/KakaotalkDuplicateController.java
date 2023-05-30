package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.KakaotalkDTO;
import com.example.demo.service.KakaotalkDuplicateService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/")
public class KakaotalkDuplicateController {

	@Autowired
	private KakaotalkDuplicateService kakaotalkDuplicateService;

	@PostMapping("kakaotalkDup")
	public Map dup(@RequestBody String kakaojson) throws JsonMappingException, JsonProcessingException {
		Map<String, Object> result = new HashMap<>();

		ObjectMapper mapper = new ObjectMapper();

		Map<String, Object> jsonMap = mapper.readValue(kakaojson, Map.class);

		Map<String, Object> properties = (Map) jsonMap.get("properties");

		Map<String, Object> kakao_account = (Map) jsonMap.get("kakao_account");

		JsonNode rootNode = mapper.readTree(kakaojson);
		
		String mem_name = (String) properties.get("nickname");
		String mem_email = (String) kakao_account.get("email");
		long mem_id = rootNode.path("id").asLong();

		KakaotalkDTO dto = new KakaotalkDTO(mem_id, mem_email);
		

		try {
			KakaotalkDTO dto_result = kakaotalkDuplicateService.dup(dto);
			if (dto_result != null) {
				result.put("result", "duplicate");
				result.put("mem_id", dto_result.getMem_id());
				result.put("mem_email", dto_result.getMem_email());

			} else {
				result.put("result", "none");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}
