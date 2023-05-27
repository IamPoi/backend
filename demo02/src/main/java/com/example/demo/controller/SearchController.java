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

		String word = map.get("word") != null ? (String) map.get("word") : "";
		System.out.println(word + "검색");

		ArrayList<MarketDTO> searchList = new ArrayList<>();

		MarketDTO dto = new MarketDTO("fail");

		if (word.length() >= 2) {

			try {

				searchList = searchService.searchList(word);
				
				if(searchList.size() == 0) {
					searchList.add(dto);
					System.out.println("리스트 없음");
				} else {
					System.out.println("검색 성공");					
				}
				

			} catch (Exception e) {
				System.out.println("실패");
				searchList.add(dto);
			}
		} else {
			searchList.add(dto);
		}

		return searchList;

	}

}
