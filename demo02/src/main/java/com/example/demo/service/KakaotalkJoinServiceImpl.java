package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.KakaotalkJoinMapper;
import com.example.demo.model.KakaotalkDTO;

@Service
public class KakaotalkJoinServiceImpl implements KakaotalkJoinService {

	private KakaotalkJoinMapper kjm;

	@Autowired
	public KakaotalkJoinServiceImpl(KakaotalkJoinMapper kjm) {
		super();
		this.kjm = kjm;
	}

	@Override
	public void kakatalkJoin(KakaotalkDTO dto) throws Exception {
		
		kjm.kakatalkJoin(dto);

	}

}
