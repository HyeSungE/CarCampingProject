package com.ezen.carCamping.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.carCamping.dto.RegionDTO;

@Service
public class AdminMapper {

	@Autowired
	private SqlSession sqlSession;
	
	public List<RegionDTO> listRegion(){
		List<RegionDTO> list = sqlSession.selectList("listRegion");
		return list;
	}
}
