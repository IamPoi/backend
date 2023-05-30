package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/")
public class KakaoTalkController {
	
	@PostMapping("kakaotalk")
	public Map kakaotalk(@RequestParam Map<String, Object> map) {
		
//		System.out.println(map.get("kakao_account"));
		
		System.out.println(map.toString());
		System.out.println(map.isEmpty());
		
		
		return map;
		
	}

}
