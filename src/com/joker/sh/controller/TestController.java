package com.joker.sh.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joker.sh.service.ITestService;

@Controller
public class TestController {

	@Resource
	private ITestService testService;
	
	@RequestMapping("test")
	public void test(){
		
		this.testService.test();
		
	}
	
	
}
