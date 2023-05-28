package com.example.demo.controller;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FindPwService;

@RestController
@RequestMapping("/")
public class FindPwController {

	@Autowired
	private FindPwService findPwService;

	@PostMapping("modPw")
	public Map findPw(@RequestParam Map<String, Object> map) {

		SHA256 sha256 = new SHA256();

		Map<String, Object> result = new HashMap<>();

		String pw = (String) map.get("mem_pw");

		try {

			map.put("mem_pw", sha256.encrypt(pw));
			findPwService.findPw(map);
			result.put("result", "success");
		} catch (Exception e) {
			result.put("result", "fail");
			e.printStackTrace();
		}

		return result;
	}
}