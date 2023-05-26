package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.PracDTO;
import com.example.demo.service.PracService;

@Controller
@RequestMapping("/")
public class PracController {

	@Autowired
	private PracService pracService;

	@GetMapping("main")
	public String prac() {
		System.out.println("컨트롤러 성공");

		try {
			ArrayList<PracDTO> dtoList = pracService.pracList();
			System.out.println(dtoList.get(0).getPrac01());
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("컨트롤러 실패");
		}

		return "/";
	}
}
