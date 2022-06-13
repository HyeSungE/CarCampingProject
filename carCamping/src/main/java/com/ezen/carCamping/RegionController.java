package com.ezen.carCamping;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.carCamping.dto.RegionDTO;
import com.ezen.carCamping.service.RegionMapper;

@Controller
public class RegionController {
	@Autowired
	private RegionMapper RegionMapper;
	
	@RequestMapping(value="goRegion.region", method=RequestMethod.GET)
	public String goRegion() {
		return "region/regionMain";
	}
	@RequestMapping(value="goRegion.region", method=RequestMethod.POST)
	public String goRegion(HttpServletRequest req,@RequestParam int region_num) {
		RegionDTO dto = RegionMapper.selectRegion(region_num);
		req.setAttribute("region", dto);
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
