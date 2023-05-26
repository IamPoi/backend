package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.JoinMapper;
import com.example.demo.model.MemberDTO;

@Service
public class JoinServiceImpl implements JoinService{
	
	private JoinMapper jm;

	@Autowired
	public JoinServiceImpl(JoinMapper jm) {
		this.jm = jm;
	}

	@Override
	public void join(MemberDTO dto) throws Exception {
		
		jm.join(dto);
		
	}
	
	
	
	

}
