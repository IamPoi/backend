package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.KakaotalkDuplicateMapper;
import com.example.demo.model.KakaotalkDTO;

@Service
public class KakaotalkDuplicateServiceImpl implements KakaotalkDuplicateService {

	private KakaotalkDuplicateMapper kdm;

	@Autowired
	public KakaotalkDuplicateServiceImpl(KakaotalkDuplicateMapper kdm) {
		super();
		this.kdm = kdm;
	}

	@Override
	public KakaotalkDTO dup(KakaotalkDTO dto) throws Exception {

		return kdm.dup(dto);
	}

}
