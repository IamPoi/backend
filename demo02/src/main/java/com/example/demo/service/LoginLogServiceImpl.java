package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.LoginLogMapper;
import com.example.demo.model.LogDTO;

@Service
public class LoginLogServiceImpl implements LoginLogService {

	private LoginLogMapper llm;

	@Autowired
	public LoginLogServiceImpl(LoginLogMapper llm) {
		super();
		this.llm = llm;
	}

	@Override
	public void loginLog(LogDTO log) throws Exception {

		System.out.println("로그인 로그");
		llm.loginLog(log);
	}

}
