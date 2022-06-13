package com.ezen.carCamping;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.carCamping.dto.ProductCategoryDTO;

@Controller
public class ProductController {
	@Autowired
	private SqlSession sqlSession;
	  
	@RequestMapping("/goProduct.product")
	public String goProduct() {
		return "product/productMain";
	}
	
	@RequestMapping("/productView.product")
	public String productView() {
		List<ProductCategoryDTO> plist= ProuductMapper.listProduct();
		
		return "product/productView";
	}
	
	@RequestMapping("/productReviewView.product")
	public String productReviewView() {
		return "product/productReviewView";
	}
}
