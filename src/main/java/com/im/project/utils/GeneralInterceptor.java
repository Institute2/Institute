package com.im.project.utils;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class GeneralInterceptor extends HandlerInterceptorAdapter{
	 public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView view) throws Exception {  
		 HandlerMethod method = (HandlerMethod)handler;  
	     MyAnnotation m=  method.getMethodAnnotation(MyAnnotation.class);  
	     Method me=method.getMethod();
	     
	    }  
	    
	    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
			return true;  
	          
	    }

}
