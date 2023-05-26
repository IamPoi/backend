package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.MarketDTO;

public interface SearchService {
	
	public ArrayList<MarketDTO> searchList(String word) throws Exception;
	
}
