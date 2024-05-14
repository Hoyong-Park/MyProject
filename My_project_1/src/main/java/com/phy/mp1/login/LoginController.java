package com.phy.mp1.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class LoginController {
	@RequestMapping("/login")
	public String requestMethodName(HttpServletRequest request) {
		request.setAttribute("cp", "home");
		request.setAttribute("cpSub", "homeContent");
		request.setAttribute("lp", "login/login"); // loginDAO에서 처리
		request.setAttribute("lpSub", "loginForm"); // loginDAO에서 처리
		request.setAttribute("isLogined", false);
		return "index";
	}
	
}
