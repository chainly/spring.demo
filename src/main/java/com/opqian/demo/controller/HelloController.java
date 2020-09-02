package com.opqian.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "arg", defaultValue = "world") String arg) {
		return "hello " + arg;
	}
}
