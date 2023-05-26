package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.MarketDTO;

public interface AutoCompleteService {

	public ArrayList<MarketDTO> autoComplete(String word) throws Exception;

}
