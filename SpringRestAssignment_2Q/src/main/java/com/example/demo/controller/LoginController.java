package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/valid",method = RequestMethod.POST,produces= "text/html")
	public String welcomePage(ModelMap model, @RequestParam String UserId,@RequestParam String Password)  {
		if(UserId.equals("Deepika") && Password.equals("deepika")) {
			return "valid";
		}
		model.put("errorMsg" , "Provide valid user id and password");
		return "login";
	}
	

}
