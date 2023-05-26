package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MemberDTO;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/")
public class SessionCheck {
	
	@GetMapping("sessionCheck")
	public void sessionCheck(HttpSession session) {
		
		try {
			MemberDTO user = (MemberDTO) session.getAttribute("user");
			System.out.println(user.toString());			
		}
		catch (Exception e) {
			System.out.println("세션 없음");
		}
	}

}
