package com.ezen.carCamping;

import javax.servlet.http.HttpServletRequest;

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
	private ProductMapper productMapper;
	  
	@RequestMapping("/goProduct.product")
	public String goProduct() {
		
		return "product/productMain";
	}
	 
	@RequestMapping("/productView.product")
	public String productView(HttpServletRequest req) {
		int pageSize = 5;
		String pageNum = req.getParameter("pageNum");
		if(pageNum==null) {
			pageNum = "1";
		}
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage)*pageSize +1;
		int endRow = startRow + pageSize -1;
		int rowCount = productMapper.getProductCount();
		List<ProductDTO> list = null;
		if(rowCount>0) {
			
		}
		
		return "product/productView";
	}//���⿡ ListBoardCommand�� �ִ� �Լ� �ҷ�����
	
	/*public String productView(HttpServletRequest req) {
		List<ProductDTO> plist = productMapper.listProduct();
		return "product/productView";
	}*/
	 
	@RequestMapping("/productReviewView.product")
	public String productReviewView() {
		return "product/productReviewView";
	}
	
	
}
