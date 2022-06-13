package com.ezen.carCamping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login.login")
	public String login() {
		return "login/login";
	}
	
	@RequestMapping("/sign.login")
	public String sign() {
		return "login/sign";
    }
	
	@RequestMapping("/findID.login")
	public String findID() {
		return "login/findID";
	 }
	
		@RequestMapping("/findPW.login")
		public String findPW() {
			return "login/findPW";
}
}
