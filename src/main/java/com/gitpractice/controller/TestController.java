package com.gitpractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@RequestMapping("/hello")
	public String helloWorld()
	{
		
		return "Hello  Rest Controller";
	}
	

	@RequestMapping("/helloworld")
	public String helloWorld1()
	{
		
		return "Hello world Rest Controller";
	}
	
	
	
}
