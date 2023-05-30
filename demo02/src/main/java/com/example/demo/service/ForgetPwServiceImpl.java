package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ForgetPwMapper;
import com.example.demo.model.MemberDTO;

@Service
public class ForgetPwServiceImpl implements ForgetPwService {

	private ForgetPwMapper fpm;

	@Autowired
	public ForgetPwServiceImpl(ForgetPwMapper fpm) {
		super();
		this.fpm = fpm;
	}

	@Override
	public MemberDTO forgetPw(Map<String, Object> map) throws Exception {
		
		return fpm.forgetPw(map);
	}

	
	
}
