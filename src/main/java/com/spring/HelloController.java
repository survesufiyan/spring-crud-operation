package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api")
public class HelloController {
	@GetMapping("/msg")
public String msg() {
	return "Spring Booot get request";
}
}
