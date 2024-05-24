package com.example.springboot_aws_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {

	@GetMapping("/data")
	public String getData() {
		return "First message AWS";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "First message AWS";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "First message AWS";
	}
}
