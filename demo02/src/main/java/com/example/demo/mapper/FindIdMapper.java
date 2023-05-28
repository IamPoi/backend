package com.example.demo.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MemberDTO;

@Repository
@Mapper
public interface FindIdMapper {
	
	public MemberDTO findId(Map<String, Object> map);

}
