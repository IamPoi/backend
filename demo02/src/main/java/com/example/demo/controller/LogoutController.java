package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/")
public class LogoutController {

	@GetMapping("logout")
	public Map logout(HttpSession session) {

		Map<String, Object> result = new HashMap<>();

		session.removeAttribute("user");
		result.put("result", "logout");

		return result;
	}

}
