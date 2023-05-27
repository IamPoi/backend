package com.example.demo.controller;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MemberDTO;
import com.example.demo.service.JoinService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class JoinController {

	@Autowired
	private JoinService joinService;

	@PostMapping("join")
	public Map join(@RequestParam Map<String, Object> map, HttpServletRequest request) {

//		ip
		ClientUtils clientUtils = new ClientUtils();
		String ip = clientUtils.getRemoteIP(request);

//		(String) map.get("mem_pw")
		String mem_id = (String) map.get("mem_id");
		String pw = (String) map.get("mem_pw");
		String mem_email = (String) map.get("mem_email");
		String marketing_flag = (String) map.get("marketing_flag");
		String mem_status = (String) map.get("mem_status");

		MemberDTO dto = new MemberDTO();

//		암호화
		SHA256 sha256 = new SHA256();

		String mem_pw = "";

		try {
			mem_pw = sha256.encrypt(pw);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		System.out.println(pw);

//		날짜 시간
		DateAndTime dateAndTime = new DateAndTime();

		LocalDate nowDate = dateAndTime.nowDate();
		LocalTime nowTime = dateAndTime.nowTime();

		dto.setMem_id(mem_id);
		dto.setMem_pw(mem_pw);
		dto.setReg_date(nowDate);
		dto.setReg_time(nowTime);
		dto.setReg_ip(ip);
		dto.setMem_email(mem_email);
		dto.setMarketing_flag(marketing_flag);
		dto.setMem_status(mem_status);

		/*
		 * System.out.println(dto.getMem_id()); System.out.println(dto.getMem_pw());
		 * System.out.println(dto.getReg_date()); System.out.println(dto.getReg_time());
		 * System.out.println(dto.getReg_ip()); System.out.println(dto.getMem_email());
		 * System.out.println(dto.getMarketing_flag());
		 * System.out.println(dto.getMem_status());
		 */

		String result = "";
		Map<String, Object> join_result = new HashMap<String, Object>();
		
		try {
			joinService.join(dto);
			System.out.println("회원가입 성공");
			result = "success";
			join_result.put("dto", dto);
		} catch (Exception e) {
			System.out.println("회원가입 실패");
			result = "fail";
		}
		
		join_result.put("result", result);
		
		
		return join_result;

	}

}
