package com.hj.hoMEnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping(value="test")
	public String testView() {
		System.out.println("test");
		return "test";
	}
}
