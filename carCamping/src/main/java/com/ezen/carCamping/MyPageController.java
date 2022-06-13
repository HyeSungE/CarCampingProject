package com.ezen.carCamping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {

	@RequestMapping("/myPageCart.myPage")
	public String myPageCart() {
		System.out.println();
		return "myPage/myPageCart";
	}
	
	@RequestMapping("/myPageContactUs.myPage")
	public String myPageContactUs() {
		System.out.println();
		return "myPage/myPageContactUs";
	}
	
	@RequestMapping("/myPageProfile.myPage")
	public String myPageProfile() {
		System.out.println();
		return "myPage/myPageProfile";
	}
	@RequestMapping("/myPageQuestion.myPage")
	public String myPageQuestion() {
		return "myPage/myPageQuestion";
	}
	
	@RequestMapping("/myPageRental.myPage")
	public String myPageRental() {
		System.out.println();
		return "myPage/myPageRental";
	}
	
	@RequestMapping("/myPageWriteReview.myPage")
	public String myPagaWriteReview() {
		return "myPage/myPageWriteReview";
	}
	
	@RequestMapping("/myPageLikeReview.myPage")
	public String myPagaLikeReview() {
		return "myPage/myPageLikeReview";
	}
	
	@RequestMapping("/myPageTest.myPage")
	public String myPageTest() {
		return "myPage/myPageTest";
	}
	
}
