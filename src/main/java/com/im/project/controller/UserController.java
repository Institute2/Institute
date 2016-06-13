package com.im.project.controller;

import java.util.HashMap;
import java.util.List;
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
	@Resource
	private UserService userService;
	@RequestMapping("/register.do")
    public void Register(User user,HttpServletRequest request,HttpServletResponse response) throws Exception{
		 Map<String, Object> map = new HashMap<String, Object>();
		 System.out.println(user.getUserName());
		 boolean result=userService.addUser(user);
		  if(result){
			  map.put("status", ReturnStatus.SUCCSS);
			  map.put("msg","成功");
		      map.put("data", null);
		  }
		  else{
			map.put("status",ReturnStatus.ERROR);
			map.put("msg","失败");
			map.put("data", null);
		  }
	   JSONUtils.toJSON(map, response);

	 }
}
