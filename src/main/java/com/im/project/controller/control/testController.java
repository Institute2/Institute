package com.im.project.controller.control;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.im.project.model.Leader;
import com.im.project.model.ReturnStatus;
import com.im.project.model.User;
import com.im.project.service.UserService;
import com.im.project.utils.JSONUtils;
@Controller("testController")
@RequestMapping("/control/test")
public class testController {
	
	 @RequestMapping("/test.do")
    public String test(Leader leader,HttpServletRequest request,HttpServletResponse response) throws ParseException{
		Map<String, Object> map = new HashMap<String, Object>();
	/*	System.out.println(leader.getName());
		System.out.println(leader.getXibie());*/
		System.out.println("lalla");
		return "ll";
		 
	 }
}

