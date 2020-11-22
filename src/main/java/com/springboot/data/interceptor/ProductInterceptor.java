package com.springboot.data.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.data.exception.handler.ProductNotFoundException;

@Component
public class ProductInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("Pre Handle method is Calling " + request.getHeader("name"));

		/*
		 * boolean flag = false; String method = request.getMethod();
		 * 
		 * if (method.equalsIgnoreCase("GET") || method.equalsIgnoreCase("POST")) {
		 * String contentType = request.getContentType(); if (null != contentType &&
		 * contentType.equalsIgnoreCase("application/json")) { flag = true; } }
		 * 
		 * 
		 * if (!flag) { throw new ProductNotFoundException("Invalid method"); }
		 */

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		System.out.println("Post Handle method is Calling");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) throws Exception {

		System.out.println("Request and Response is completed");
	}
}
