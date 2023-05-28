package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.FindIdMapper;
import com.example.demo.model.MemberDTO;

@Service
public class FindIdServiceImpl implements FindIdService {

	private FindIdMapper fim;

	@Autowired
	public FindIdServiceImpl(FindIdMapper fim) {
		super();
		this.fim = fim;
	}

	@Override
	public MemberDTO findId(Map<String, Object> map) throws Exception {

		return fim.findId(map);

	}

}
