package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LogDTO;
import com.example.demo.service.LogSearchService;

@RestController
@RequestMapping("/")
public class LogSearchController {

	@Autowired
	private LogSearchService logSearchService;

	@GetMapping("logSearch")
	public ArrayList<LogDTO> logSearch(@RequestParam Map<String, Object> map) {
		String id = (String) map.get("id");

		ArrayList<LogDTO> list = null;

		try {
			list = logSearchService.logSearch(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

}
