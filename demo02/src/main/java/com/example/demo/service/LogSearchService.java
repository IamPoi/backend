package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.LogDTO;

public interface LogSearchService {

	public ArrayList<LogDTO> logSearch(String id) throws Exception;

}
