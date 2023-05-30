package com.example.demo.service;

import java.util.Map;

import com.example.demo.model.MemberDTO;

public interface ForgetPwService {
	
	public MemberDTO forgetPw(Map<String, Object> map) throws Exception;

}
