package com.ngs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

	@RequestMapping("/")
	public String home() {
		return "Home.jsp";
	}
}
