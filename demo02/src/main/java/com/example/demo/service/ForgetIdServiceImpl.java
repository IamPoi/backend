package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ForgetIdMapper;
import com.example.demo.model.MemberDTO;

@Service
public class ForgetIdServiceImpl implements ForgetIdService {

	private ForgetIdMapper fim;

	@Autowired
	public ForgetIdServiceImpl(ForgetIdMapper fim) {
		super();
		this.fim = fim;
	}

	@Override
	public MemberDTO forgetId(Map<String, Object> map) {

		return fim.forgetId(map);
	}

}
