package com.campus.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String Home() {
		//return "home_main";
		return "mango_test/mango_test";
	}
}