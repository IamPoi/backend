package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.AutoCompleteMapper;
import com.example.demo.model.MarketDTO;

@Service
public class AutoCompleteServiceImpl implements AutoCompleteService {

	private AutoCompleteMapper acm;

	@Autowired
	public AutoCompleteServiceImpl(AutoCompleteMapper acm) {
		this.acm = acm;
	}

	@Override
	public ArrayList<MarketDTO> autoComplete(String word) throws Exception {

		System.out.println("자동완성");
		ArrayList<MarketDTO> list = acm.autoComplete(word);

		return list;
	}

}
