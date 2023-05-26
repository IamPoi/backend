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

import com.example.demo.model.LogDTO;
import com.example.demo.model.MemberDTO;
import com.example.demo.service.LogNumService;
import com.example.demo.service.LoginLogService;
import com.example.demo.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private LoginLogService loginLogService;

	@Autowired
	private LogNumService logNumService;

	@PostMapping("login")
	public Map login(@RequestParam Map<String, Object> map, HttpSession session, HttpServletRequest request) {

		System.out.println("로그인 컨트롤러");
		System.out.println(map.get("mem_id"));

		String mem_id = (String) map.get("mem_id");
		String mem_pw = (String) map.get("mem_pw");

		SHA256 sha256 = new SHA256();

		try {
			mem_pw = sha256.encrypt(mem_pw);
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		}

		map.put("mem_pw", mem_pw);
		System.out.println(mem_pw);

		String result = "";
		

		try {
			System.out.println("로그인 시도");
			MemberDTO dto = loginService.login(map);
			session.setAttribute("user", dto);
			System.out.println("로그인 성공");
			result = "success";
		} catch (Exception e) {
			System.out.println("로그인 실패");
			result = "fail";
		}

		ClientUtils clientUtils = new ClientUtils();
		DateAndTime dateAndTime = new DateAndTime();

		LocalDate date = dateAndTime.nowDate();
		LocalTime time = dateAndTime.nowTime();
		String ip = clientUtils.getRemoteIP(request);

		int num = 0;
		try {
			num = logNumService.logNum(mem_id);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		LogDTO log = new LogDTO(num + 1, mem_id, date, time, ip);

		System.out.println(log.toString());

		try {
			loginLogService.loginLog(log);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Map<String, Object> login_result = new HashMap<String, Object>();
		
		login_result.put("result", result);

		return login_result;

	}

}
