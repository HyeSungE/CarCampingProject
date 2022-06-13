package com.ezen.carCamping;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("/goProduct.product")
	public String goProduct() {
		return "product/productMain";
	}
	
	@RequestMapping("/productView.product")
	public String productView(HttpServletRequest req) {
		return "product/productView";
	}//���⿡ ListBoardCommand�� �ִ� �Լ� �ҷ�����
	
	@RequestMapping("/productReviewView.product")
	public String productReviewView() {
		return "product/productReviewView";
	}
}
