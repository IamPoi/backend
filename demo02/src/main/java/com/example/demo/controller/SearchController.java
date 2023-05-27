package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
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
	public Map search(@RequestParam Map<String, Object> map, Model model) {

		Map<String, Object> result = new HashMap<>();

		String word = map.get("word") != null ? (String) map.get("word") : "";
		System.out.println(word + "검색");

		ArrayList<MarketDTO> searchList = new ArrayList<>();

		if (word.length() >= 2) {

			try {

				searchList = searchService.searchList(word);
				
//				System.out.println(searchList.get(0).toString());

				if (searchList.size() == 0) {
					result.put("result", "fail");
					System.out.println("리스트 없음");
				} else {
					System.out.println("검색 성공");
					result.put("result", "success");
					result.put("searchList",searchList);
				}

			} catch (Exception e) {
				System.out.println("실패");
				System.out.println("리스트 없음");
				result.put("result", "fail");
			}
		} else {
			result.put("result", "fail");
		}

		return result;

	}

}
