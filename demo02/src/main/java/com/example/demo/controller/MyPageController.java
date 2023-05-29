package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MemberDTO;
import com.example.demo.service.SendMail;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/")
public class MyPageController {

	@GetMapping("myPage")
	public Map myPage(HttpSession session) {

		Map<String, Object> map = new HashMap<>();

		try {

			MemberDTO dto = (MemberDTO) session.getAttribute("user");

			map.put("result", "success");
			map.put("user", dto);

		} catch (Exception e) {
			e.printStackTrace();
			map.put("result", "fail");

		}

		return map;
	}

}
