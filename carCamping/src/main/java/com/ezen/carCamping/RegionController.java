package com.ezen.carCamping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegionController {
	
	@RequestMapping("/goRegion.region")
	public String goRegion() {
		return "region/regionMain";
	}
	
	@RequestMapping("/regionReviewView.region")
	public String regionReviewView() {
		return "/region/regionReviewView";
	}
	
	@RequestMapping("/regionView.region")
	public String regionView() {
		return "/region/regionView";
	}
}
