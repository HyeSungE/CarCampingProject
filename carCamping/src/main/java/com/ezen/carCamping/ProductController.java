package com.ezen.carCamping;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.carCamping.dto.ProductCategoryDTO;
import com.ezen.carCamping.service.ProductMapper;

@Controller
public class ProductController {
	@Autowired
	private ProductMapper productMapper;
	  
	@RequestMapping("/goProduct.product")
	public String goProduct() {
		return "product/productMain";
	}
	
	@RequestMapping("/productView.product")
<<<<<<< HEAD
	public String productView(HttpServletRequest req) {
=======
	public String productView() {
		List<ProductCategoryDTO> plist= SqlSession.listProduct();
>>>>>>> 69b97fa43f4848e582057c905fa6381b3dcdde61
		return "product/productView";
	}//���⿡ ListBoardCommand�� �ִ� �Լ� �ҷ�����
	
	@RequestMapping("/productReviewView.product")
	public String productReviewView() {
		return "product/productReviewView";
	}
}
