package com.xsis.training.smartweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hallo")
public class HalloController {
	
	@GetMapping
	@ResponseBody
	public String index() {
		return "hello controller";
	}

}
