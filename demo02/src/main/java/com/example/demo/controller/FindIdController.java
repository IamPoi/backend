package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FindIdService;

@RestController
@RequestMapping("/")
public class FindIdController {

	@Autowired
	private FindIdService findIdService;

	@PostMapping("findId")
	public Map findId(@RequestParam Map<String, Object> map) {

		Map<String, Object> result = new HashMap<>();

		try {
			result.put("findId", findIdService.findId(map));
			result.put("result", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("result", "fail");
		}

		return result;

	}

}
