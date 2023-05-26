package com.example.demo.controller;

import java.util.ArrayList;
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
	public ArrayList<MarketDTO> search(@RequestParam Map<String, Object> map, HttpServletRequest request) {

		String word = (String) map.get("word");
		ArrayList<MarketDTO> list = null;

		try {
			list = autoCompleteService.autoComplete(word);
			System.out.println("검색 성공");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("실패");
		}

		return list;

	}

}
