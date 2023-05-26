package com.example.demo.service;

import java.util.Map;

import com.example.demo.model.MemberDTO;

public interface LoginService {
	
	public MemberDTO login(Map<String, Object> map) throws Exception;

}
