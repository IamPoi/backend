package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class VerificationMailController {

	@Autowired
	private EmailService emailService;

	@Autowired
	public VerificationMailController(EmailService emailService) {
		this.emailService = emailService;
	}

	@GetMapping("verification")
	public Map verification(@RequestParam Map<String, Object> map) {

		Map<String, Object> result = new HashMap<>();		

		String to = (String) map.get("email");
		
		String numbers = emailService.sendEmail(to);

		result.put("numbers", numbers);

		return result;
	}

}
