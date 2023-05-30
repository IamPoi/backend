package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ForgetIdService;

@RestController
@RequestMapping("/")
public class ForgetIdController {

	@Autowired
	private ForgetIdService forgetIdService;

	@Autowired
	private EmailService emailService;

	@PostMapping("forgetId")
	public Map forgetId(@RequestParam Map<String, Object> map) {

		Map<String, Object> result = new HashMap<>();

		try {
			forgetIdService.forgetId(map).getMem_id();
			
			result.put("result", "success");
			
			String to = (String) map.get("mem_email");

			String numbers = emailService.sendEmail(to);

			result.put("numbers", numbers);
			
		} catch (Exception e) {
			result.put("result", "fail");
//			e.printStackTrace();
		}

		return result;
	}

}
