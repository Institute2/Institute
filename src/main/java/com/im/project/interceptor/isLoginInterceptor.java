package com.im.project.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.im.project.utils.MyAnnotation;

public class isLoginInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//注意此处必须返回true，否则请求将停止  
        //return true;  

		  HandlerMethod method = (HandlerMethod)handler;  
	      MyAnnotation permission = method.getMethodAnnotation(MyAnnotation.class);  
	          
	        //如果为空在表示该方法不需要进行权限验证  
	        if (permission == null) {  
	            return true;  
	        }  
	        if(request.getSession().getAttribute("username")!=null){  
	        
	        return true;  
	        }
	        response.sendRedirect("/control/login.jsp");
	        return false;
	}
	}

	


