package com.cos.board.test.intercepter;
/*
 * 2020.10.15-5
 * 
 * 선행: MyFilter2.java
 * 후행: WebMvcConfig.java
 * 
 * 인터셉터는 AOP로 만들어져있음 
 * 
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyIntercepter implements HandlerInterceptor{
	
	// 특정 컨트롤러의 함수 요청 시에 session 값 확인 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		//세션체크를 여기서 한 뒤, 
		
		System.out.println("MyIntercepter preHandle() 실행됨");
		return true; // true면 함수 내부 실행
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyIntercepter postHandle() 실행됨");
	}
}
