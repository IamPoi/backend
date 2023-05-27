package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.GeoListMapper;
import com.example.demo.model.GeoDTO;

@Service
public class GeoListServiceImpl implements GeoListService{
	
	
	private GeoListMapper glm;
	
	@Autowired
	public GeoListServiceImpl(GeoListMapper glm) {
		super();
		this.glm = glm;
	}

	@Override
	public ArrayList<GeoDTO> geoList() throws Exception {
		return glm.geoList();
	}
	
	
	
	

}
