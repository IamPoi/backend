package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.FindPwMapper;

@Service
public class FindPwServiceImpl implements FindPwService{
	
	private FindPwMapper fpm;

	@Autowired
	public FindPwServiceImpl(FindPwMapper fpm) {
		super();
		this.fpm = fpm;
	}

	@Override
	public void findPw(Map<String, Object> map) throws Exception {

		fpm.findPW(map);

	}

	
	
	

}
