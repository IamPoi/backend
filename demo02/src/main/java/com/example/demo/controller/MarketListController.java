package com.example.demo.controller;

import java.util.ArrayList;

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
	public ArrayList<MarketDTO> marketList() {

		ArrayList<MarketDTO> marketList = new ArrayList<>();
		MarketDTO dto = new MarketDTO("fail");

		try {
			marketList = marketListService.marketList();
			System.out.println("검색 성공");
		} catch (Exception e) {
			e.printStackTrace();
			marketList.add(0, dto);
			System.out.println("검색 실패");
		}

		return marketList;
	}

}
