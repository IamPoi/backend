package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/")
public class LogoutController {
	
	@GetMapping("logout")
	public void logout(HttpSession session) {
		
		session.removeAttribute("user");
		
	}


}
