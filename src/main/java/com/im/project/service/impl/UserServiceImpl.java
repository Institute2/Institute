package com.im.project.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.im.project.manager.UserMapper;
import com.im.project.model.User;
import com.im.project.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userDao;
	public int save(User user) {
		System.out.println("save");
		int userFlag = userDao.insert(user);
		return userFlag;
		
	}

	

}
