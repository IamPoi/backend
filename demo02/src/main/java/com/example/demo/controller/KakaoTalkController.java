package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/")
public class KakaoTalkController {
	
	@PostMapping("kakaotalkCheck")
	public Map kakaotalk(@RequestBody String kakaojson) throws JsonMappingException, JsonProcessingException {
		
//		System.out.println(map.get("kakao_account"));
		
		ObjectMapper mapper = new ObjectMapper();
		
        Map<String, Object> jsonMap = mapper.readValue(kakaojson, Map.class);
        
        Map<String, Object> properties = (Map)jsonMap.get("properties");
        
        Map<String, Object> kakao_account = (Map)jsonMap.get("kakao_account");
        
        JsonNode rootNode = mapper.readTree(kakaojson);
        
                
        String nickname = (String)properties.get("nickname");
        String email = (String)kakao_account.get("email");
        long id = rootNode.path("id").asLong();
        
        Map<String, Object> result = new HashMap<>();
        
		result.put("nickname", nickname);
		result.put("email", email);
		result.put("id", id);
        
        System.out.println(nickname);
        System.out.println(email);
        System.out.println(id);
		
		
		return result;
		
	}

}
