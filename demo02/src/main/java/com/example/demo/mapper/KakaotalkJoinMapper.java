package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.KakaotalkDTO;

@Repository
@Mapper
public interface KakaotalkJoinMapper {
	
	public void kakatalkJoin(KakaotalkDTO dto);

}
