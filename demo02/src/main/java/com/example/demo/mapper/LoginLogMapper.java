package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.LogDTO;

@Repository
@Mapper
public interface LoginLogMapper {

	public void loginLog(LogDTO log);

}
