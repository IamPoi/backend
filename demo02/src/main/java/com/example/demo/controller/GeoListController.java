package com.example.demo.controller;

import java.util.ArrayList;

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
	
	@GetMapping("getoList")
	public ArrayList<GeoDTO> geoList(){
		
		ArrayList<GeoDTO> geoList = new ArrayList<>();
		
		try {
			geoList = geoListService.geoList();
			System.out.println("지역 리스트 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("지역 리스트 실패");
		}
		
		return geoList;
	}
	
	

}
