package com.im.project.controller.control;

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
	@RequestMapping("/login.do")
    public void login(User user,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
	 }
}
