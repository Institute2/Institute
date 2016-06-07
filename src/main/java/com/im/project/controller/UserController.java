package com.im.project.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.im.project.model.ReturnStatus;
import com.im.project.model.User;
import com.im.project.service.UserService;
import com.im.project.utils.JSONUtils;

@Controller("userController")
@RequestMapping("/user")
public class UserController {
/*	@Resource
	private UserService userService;
	 @RequestMapping("/register.do")
    public void Register(User user,HttpServletRequest request,HttpServletResponse response) throws ParseException{
		 Map<String, Object> map = new HashMap<String, Object>();
		 System.out.println(user.getUserName());
		 int result=userService.save(user);
		  if(result!=0){
			  map.put("status", ReturnStatus.SUCCSS);
			  map.put("msg","�ɹ�");
		      map.put("data", null);
		  }
		  else{
			map.put("status",ReturnStatus.ERROR);
			map.put("msg","����ʧ��");
			map.put("data", null);
		  }
	
	   JSONUtils.toJSON(map, response);
		 
	 }*/
}
