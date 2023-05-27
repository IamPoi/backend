package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MarketListMapper;
import com.example.demo.model.MarketDTO;

@Service
public class MarketListServiceImpl  implements MarketListService{
	
	private MarketListMapper mlm;

	@Autowired
	public MarketListServiceImpl(MarketListMapper mlm) {
		super();
		this.mlm = mlm;
	}

	@Override
	public ArrayList<MarketDTO> marketList() throws Exception {
		ArrayList<MarketDTO> list = mlm.marketList();
		return list;
	}
	
	
	

}
