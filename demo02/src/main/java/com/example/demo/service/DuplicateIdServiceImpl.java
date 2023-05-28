package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DuplicateIdMapper;
import com.example.demo.model.MemberDTO;

@Service
public class DuplicateIdServiceImpl implements DuplicateIdService{
	
	private DuplicateIdMapper dim;
	
	@Autowired
	public DuplicateIdServiceImpl(DuplicateIdMapper dim) {
		super();
		this.dim = dim;
	}

	@Override
	public MemberDTO duplicateId(Map<String, Object> map) throws Exception {
		
		return dim.duplicateId(map);
	}
	
	

}
