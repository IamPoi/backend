package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.SearchMapper;
import com.example.demo.model.MarketDTO;

@Service
public class SearchServiceImpl implements SearchService{
	
	private final SearchMapper sm;
	
	@Autowired
	public SearchServiceImpl(SearchMapper sm) {
		this.sm = sm;
	}
	
	@Override
	public ArrayList<MarketDTO> searchList(String word) throws Exception {
		
		System.out.println("서비스 접근");
		
		ArrayList<MarketDTO> list = sm.searchList(word);
		System.out.println(list.size());
		
		
		return list;  
	}

}
