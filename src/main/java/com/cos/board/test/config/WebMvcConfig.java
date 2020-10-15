package com.cos.board.test.config;
/*
 * 2020.10.15-6
 * 
 * 선행: MyIntercepter.java
 * 후행: 
 * 
 * 인터셉터 등록 
 * 공통적으로 실행되어야 하는 부분을 여기서 작성(ex. 유효성 검사)
 * 
 * 필터: 전체
 * 인터셉터: 부분
 * 인터셉터: 전체 + 후처리
 * 
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cos.board.test.intercepter.MyIntercepter;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// admin/** 이하 주소로 들어오면 MyIntercepter를 발동 
		registry.addInterceptor(new MyIntercepter()).addPathPatterns("/test/admin/**")
			.addPathPatterns("/user/**")
			.excludePathPatterns("/test/admin/a"); // 제외
	}
	
}
