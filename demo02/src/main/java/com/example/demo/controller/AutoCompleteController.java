package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MarketDTO;
import com.example.demo.service.AutoCompleteService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class AutoCompleteController {

	@Autowired
	private AutoCompleteService autoCompleteService;

	@GetMapping("autoComplete")
	public Map search(@RequestParam Map<String, Object> map, HttpServletRequest request) {

		String word = map.get("word") != null ? (String) map.get("word") : "";

		ArrayList<MarketDTO> list = new ArrayList<>();

		Map<String, Object> result = new HashMap<>();

		if (word.length() >= 2) {

			try {
				list = autoCompleteService.autoComplete(word);
				result.put("result", "success");
				result.put("list", list);
				System.out.println("검색 성공");

			} catch (Exception e) {
				result.put("result", "fail");
				System.out.println("실패");
				e.printStackTrace();
			}
		}

		return result;

	}

}
