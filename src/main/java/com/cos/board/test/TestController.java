package com.cos.board.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/test")
	public String home() {
		return "<h1>home</h1>";
	}
}
