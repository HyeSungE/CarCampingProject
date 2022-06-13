package com.ezen.carCamping.service;

import java.util.*;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.carCamping.dto.ProductDTO;

public class ProductMapper {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<ProductDTO>listProduct(){
		List<ProductDTO>list= sqlSession.selectList("listProduct");
		return list; 
	}
	public List<ProductDTO> findProduct(String search,String searchString){
		Map<String,String> map = new Hashtable<String, String>();
		map.put("search", search);
		map.put("searString", searchString);
		List<ProductDTO>find = sqlSession.selectList("findProduct",map);
		return find;
	}
	
}
 