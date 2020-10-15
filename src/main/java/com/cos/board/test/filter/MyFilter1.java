package com.cos.board.test.filter;
/*
 * 2020.10.15-2
 * 
 * 선행: TestController.java
 * 후행: MyFilterConfig.java
 * 
 */

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter1 implements Filter{

	public static final String TAG = "MyFilter1 : ";
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println(TAG + "doFilter() 탐");
		chain.doFilter(request, response); // 다음 필터 탈수 있도록 필터 체인 걸어줌, 없으면 멈춤
	}

}
