package com.example.demo.service;

import java.util.Map;

import com.example.demo.model.MemberDTO;

public interface DuplicateIdService {
	
	public MemberDTO duplicateId(Map<String, Object> map) throws Exception;

}
