package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.LogSearchMapper;
import com.example.demo.model.LogDTO;

@Service
public class LogSearchServiceImpl implements LogSearchService{
	
	private LogSearchMapper lsm;
	
	@Autowired
	public LogSearchServiceImpl(LogSearchMapper lsm) {
		super();
		this.lsm = lsm;
	}
	

	@Override
	public ArrayList<LogDTO> logSearch(String id) throws Exception {
		ArrayList<LogDTO> list =  lsm.logSearch(id);
		
		return list;
	}



}
