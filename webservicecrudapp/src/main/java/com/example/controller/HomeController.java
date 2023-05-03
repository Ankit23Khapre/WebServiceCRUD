package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/appruning")
	public String appRuning()
	{
		return "Hello.....";
	}
	
	
}
