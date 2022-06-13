package com.ezen.carCamping.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.carCamping.dto.ProductDTO;

public class ProductMapper {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<ProductDTO>listProduct(){
		List<ProductDTO>list= sqlSession.selectList("listProduct");
		return list; 
	}
}
