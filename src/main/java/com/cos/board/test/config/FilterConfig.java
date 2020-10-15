package com.cos.board.test.config;
/*
 * 2020.10.15-3
 * 
 * 선행: MyFilter1.java
 * 후행: MyFilter2.java
 * 
 *  스프링에서 필터 사용하고 싶으면 FilterRegistrationBean
 *  
 *  두번째 필터를 타게하고 싶으면 필터체인 해줘야함 ..
 * 
 */

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cos.board.test.filter.MyFilter1;
import com.cos.board.test.filter.MyFilter2;

@Configuration // 설정파일 메모리에 띄움 
public class FilterConfig {
	
	@Bean // IoC에 등록??
	public FilterRegistrationBean<MyFilter1> myFilter1() {
		
		System.out.println("서버 실행될 때 나 실행될까? 응! @Bean 붙어있으니까 강제로 실행시켜서 IoC에 리턴함");
		// 필터 등록 
		FilterRegistrationBean<MyFilter1> bean = new FilterRegistrationBean<>(new MyFilter1());
		
		// /*: 모든 요청을 필터하겠다. 
		bean.addUrlPatterns("/*");
		
		// 낮은 번호부터 실행됨
		bean.setOrder(0);
		
		return bean;
	}
	
	@Bean 
	public FilterRegistrationBean<MyFilter2> myFilter2() {
		
		System.out.println("서버 실행될 때 나 실행될까? 응! @Bean 붙어있으니까 강제로 실행시켜서 IoC에 리턴함");

		FilterRegistrationBean<MyFilter2> bean = new FilterRegistrationBean<>(new MyFilter2());

		bean.addUrlPatterns("/*");
		bean.setOrder(1);
		
		return bean;
	}
}
