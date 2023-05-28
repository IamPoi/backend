package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.GeoDTO;
import com.example.demo.service.GeoListService;

@RestController
@RequestMapping("/")
public class GeoListController {
	
	@Autowired
	private GeoListService geoListService;
	
	@GetMapping("geoList")
	public Map geoList(){
		
		ArrayList<GeoDTO> geoList = new ArrayList<>();
		
		Map<String , Object > result = new HashMap<>();
		
		try {
			geoList = geoListService.geoList();
			result.put("result", "success");
			result.put("geoList", geoList);
			System.out.println("지역 리스트 성공");
		} catch (Exception e) {
			result.put("result", "fail");
			e.printStackTrace();
			System.out.println("지역 리스트 실패");
		}
		
		return result;
	}
	
	

}
