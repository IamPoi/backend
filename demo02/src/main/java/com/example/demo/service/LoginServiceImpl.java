package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.LoginMapper;
import com.example.demo.model.MemberDTO;

@Service
public class LoginServiceImpl  implements LoginService{
	
	private LoginMapper lm;

	@Autowired
	public LoginServiceImpl(LoginMapper lm) {
		super();
		this.lm = lm;
	}

	@Override
	public MemberDTO login(Map<String, Object> map) throws Exception {
		
		 System.out.println("로그인");
		 
		 MemberDTO member = lm.login(map);
		 System.out.println(member.getMem_id());
		 
		return member;
	}
	
	
	
	

}
