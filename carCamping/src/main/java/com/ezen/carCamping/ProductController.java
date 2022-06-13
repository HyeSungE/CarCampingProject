package com.ezen.carCamping;

<<<<<<< HEAD
import javax.servlet.http.HttpServletRequest;

=======
import java.io.File;
import java.io.IOException;
>>>>>>> cbed9ea1c50c62715890e8a709d153506f7e682c
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
<<<<<<< HEAD
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
	}//여기에 ListBoardCommand에 있는 함수 불러오긴
	
=======
	public String productView() {
		List<ProductCategoryDTO> plist=sqlSession.selectList("listProduct");
		return "product/productView";
	}
	 
>>>>>>> cbed9ea1c50c62715890e8a709d153506f7e682c
	@RequestMapping("/productReviewView.product")
	public String productReviewView() {
		return "product/productReviewView";
	}
	
	
}
