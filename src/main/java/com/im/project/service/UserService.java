package com.im.project.service;

import com.im.project.model.User;

public interface UserService {
	public User findUser(Integer id);
	public boolean addUser(User user);
	

}
