package com.ezen.carCamping;

import javax.servlet.http.HttpServletRequest;

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
	public String productView(HttpServletRequest req) {
		return "product/productView";
	}//여기에 ListBoardCommand에 있는 함수 불러오긴
	
	@RequestMapping("/productReviewView.product")
	public String productReviewView() {
		return "product/productReviewView";
	}
}
