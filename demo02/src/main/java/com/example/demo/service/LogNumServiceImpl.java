package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.LogNumMapper;

@Service
public class LogNumServiceImpl implements LogNumService{
	
	private LogNumMapper lnm;

	@Autowired
	public LogNumServiceImpl(LogNumMapper lnm) {
		super();
		this.lnm = lnm;
	}

	@Override
	public int logNum(String mem_id) throws Exception {
		
		int num = lnm.logNum(mem_id);
		
		return num;
	}
	
	
	
	

}
