package com.cos.board.test.filter;
/*
 * 2020.10.15-4
 * 
 * 선행: FilterConfig.java
 * 후행: MyIntercepter.java
 * 
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFilter2 implements Filter{

	public static final String TAG = "MyFilter2 : ";
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println(TAG + "doFilter() 탐");
		
		HttpServletRequest req = (HttpServletRequest) request; // 다운캐스팅??
		
//		if(req.getParameter("name") == null) {
//			HttpServletResponse resp = (HttpServletResponse) response;
//			resp.setContentType("text/html; charset=UTF-8");
//			
//			PrintWriter out = resp.getWriter();
//			out.print("<script>");
//			out.print("alert('이름추가해');");
//			out.print("</script>");
//			out.print("<h1>야 너 이름 좀 추가해</h1>"); // 데이터 리턴 
//		} else {
			chain.doFilter(request, response); // 다음 필터 탈수 있도록 필터 체인 걸어줌, 없으면 멈춤
//		}
	}

}
