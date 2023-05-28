package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DuplicateIdService;

@RestController
@RequestMapping("/")
public class DuplicateIdController {

	@Autowired
	private DuplicateIdService duplicateIdService;

	@PostMapping("duplicateId")
	public Map duplicateId(@RequestParam Map<String, Object> map) {

		Map<String, Object> result = new HashMap<>();

		try {
			if (duplicateIdService.duplicateId(map) != null) {
				result.put("result", "duplicate");
			} else {
				result.put("result", "none");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
