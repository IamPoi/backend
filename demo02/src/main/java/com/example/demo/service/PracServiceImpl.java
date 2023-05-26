package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PracMapper;
import com.example.demo.model.PracDTO;

@Service
public class PracServiceImpl implements PracService {

	private final PracMapper pm;

	@Autowired
	public PracServiceImpl(PracMapper pm) {
		this.pm = pm;
	}

	@Override
	public ArrayList<PracDTO> pracList() throws Exception {
		System.out.println("서비스 접근");

		ArrayList<PracDTO> list = pm.pracList();

		System.out.println("성공");

		return list;
	}
}
