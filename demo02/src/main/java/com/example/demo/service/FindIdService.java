package com.example.demo.service;

import java.util.Map;

import com.example.demo.model.MemberDTO;

public interface FindIdService {
	
	public MemberDTO findId(Map<String, Object> map) throws Exception;

}
