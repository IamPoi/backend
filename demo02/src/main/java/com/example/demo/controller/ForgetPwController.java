package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ForgetPwService;

@RestController
@RequestMapping("/")
public class ForgetPwController {

	@Autowired
	private ForgetPwService forgetPwService;

	@Autowired
	private EmailService emailService;

	@PostMapping("forgetPw")
	public Map forgetPw(@RequestParam Map<String, Object> map) {

		Map<String, Object> result = new HashMap<>();

		try {
			forgetPwService.forgetPw(map).getMem_id();
			
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
