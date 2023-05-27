package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MarketDTO;
import com.example.demo.service.MarketListService;

@RestController
@RequestMapping("/")
public class MarketListController {

	@Autowired
	private MarketListService marketListService;

	@GetMapping("marketList")
	public Map marketList() {

		ArrayList<MarketDTO> marketList = new ArrayList<>();

		Map<String, Object> result = new HashMap<>();

		try {
			marketList = marketListService.marketList();
			System.out.println("검색 성공");
			result.put("marketList", marketList);
			result.put("result", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("result", "fail");
			System.out.println("검색 실패");
		}

		return result;
	}

}
