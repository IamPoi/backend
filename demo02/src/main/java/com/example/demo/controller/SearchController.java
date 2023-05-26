package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MarketDTO;
import com.example.demo.service.SearchService;

@RestController
@RequestMapping("/")
public class SearchController {

	@Autowired
	private SearchService searchService;

	@GetMapping("search")
//	public String search(@RequestParam Map<String, Object> map, Model model) {
	public ArrayList<MarketDTO> search(@RequestParam Map<String, Object> map, Model model) {

		String word = (String) map.get("word");
		System.out.println(word + "검색");
		
		ArrayList<MarketDTO> searchList = null;

		try {
			searchList = searchService.searchList(word);
			System.out.println("검색 성공");
			model.addAttribute("searchList", searchList);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("실패");
		}

		return searchList;

	}

}
