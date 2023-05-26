package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MarketDTO;

@Repository
@Mapper
public interface SearchMapper {
	public ArrayList<MarketDTO> searchList(String word);

}
