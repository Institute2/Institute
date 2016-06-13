package com.im.project.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.im.project.exception.CustomException;

public class PicUploadInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		MultipartHttpServletRequest mhsq = (MultipartHttpServletRequest) request;
		MultipartFile multipartFile = mhsq.getFile("imageUrl");
		if(multipartFile==null){
			throw new CustomException("请先选择文件");
		}
		boolean boo = false;
		String fileName = multipartFile.getName();
		String fileType = "jpg,png,ico,bmp,jpeg";
		String suffix = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
		if (fileType.contains(suffix.trim().toLowerCase())) {
			boo = true;
		}else{
			throw new CustomException("图片类型错误");
		}
		return boo;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterConcurrentHandlingStarted(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

}
