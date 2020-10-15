package com.cos.board.test;
/*
 * 2020.10.15-1
 * 
 * 선행: application.yml
 * 후행: MyFilter1.java
 * 
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/test")
	public String home() {
		return "<h1>home</h1>";
	}
	
	@GetMapping("/test/admin")
	public String admin() {
		return "<h1>admin</h1>";
	}
}
