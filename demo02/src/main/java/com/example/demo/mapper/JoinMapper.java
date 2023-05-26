package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MemberDTO;

@Repository
@Mapper
public interface JoinMapper {
	
	public void  join(MemberDTO dto); 

}
