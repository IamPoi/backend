package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.LogDTO;

@Repository
@Mapper
public interface LogSearchMapper {

	public ArrayList<LogDTO> logSearch(String id);

}
