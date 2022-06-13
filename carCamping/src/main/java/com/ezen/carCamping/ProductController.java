package com.ezen.carCamping;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ezen.carCamping.dto.ProductCategoryDTO;
import com.ezen.carCamping.dto.ProductDTO;
import com.ezen.carCamping.service.ProductMapper;

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
		List<ProductCategoryDTO> plist=sqlSession.selectList("listProduct");
		return "product/productView";
	}
	 
	@RequestMapping("/productReviewView.product")
	public String productReviewView() {
		return "product/productReviewView";
	}
	
	
}
