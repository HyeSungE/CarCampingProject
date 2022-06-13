package com.ezen.carCamping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class reviewController {

	
	@RequestMapping("/field_review.review")
	public String field_review() {
		return "review/field_review";
	}
}
