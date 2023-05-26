package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PracDTO;

@Repository
@Mapper
public interface PracMapper {
	public ArrayList<PracDTO> pracList();
}
