package com.ezen.carCamping;

<<<<<<< HEAD
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.carCamping.dto.MemberDTO;
import com.ezen.carCamping.service.MemberMapper;
=======
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 2db792d2cce64969a4f2de6b3a95daa674cf0541

@Controller
public class MemberController {
	
<<<<<<< HEAD
	@Autowired
	private MemberMapper memberMapper;
	
=======
>>>>>>> 2db792d2cce64969a4f2de6b3a95daa674cf0541
	@RequestMapping("/login.login")
	public String login() {
		return "login/login";
	}
	
<<<<<<< HEAD
	@RequestMapping("/findID.login")
	public String searchMemberID() {
		return "login/findID";
	}
	
	@RequestMapping("/findPW.login")
	public String searchMemberPW() {
		return "login/findPW";
	}
	
	@RequestMapping("/checkMemberID.login")
	public String checkMemberID(HttpServletRequest req, 
									@RequestParam Map<String, String> params) {
		String msg = memberMapper.searchMemberID(params);
		String url = "login.login";
		req.setAttribute("msg", msg);
		req.setAttribute("url", url);
		return "message";
	}
	
	@RequestMapping("/checkMemberPW.login")
	public String checkMemberPW(HttpServletRequest req, 
									@RequestParam Map<String, String> params) {
		String msg = memberMapper.searchMemberPW(params);
		String url = "login.login";
		req.setAttribute("msg", msg);
		req.setAttribute("url", url);
		return "message";
	}
	
	@RequestMapping("/login_ok.login")
	public String loginOk(HttpServletRequest req, HttpServletResponse resp,			
			@RequestParam Map<String, String> params) {
		MemberDTO dto = memberMapper.getMemberId(params.get("mem_id"));
		
		String msg = null, url = null;
		if (dto == null){	
			msg = "해당하는 아이디가 없습니다. 다시 확인하고 로그인해 주세요!!";
			url = "login.login";
		}else {
			if (params.get("passwd").equals(dto.getMem_password())){
				msg = dto.getMem_id()+"님, 환영합니다!!";
				url = "index_member.do";
				HttpSession session = req.getSession();
				session.setAttribute("mbdto", dto);
				Cookie ck = new Cookie("saveId", dto.getMem_id());
				if (params.containsKey("saveId")){
					ck.setMaxAge(0);
				}else {
					ck.setMaxAge(24*60*60);
				}
				resp.addCookie(ck);
			}else {	
				msg = "비밀번호가 틀렸습니다. 다시 확인하고 로그인해 주세요!!";
				url = "login.do";
			}
		}
		req.setAttribute("msg", msg);
		req.setAttribute("url", url);
		return "message";
=======
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
>>>>>>> 2db792d2cce64969a4f2de6b3a95daa674cf0541
}
}
