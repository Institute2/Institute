package com.im.project.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.im.project.manager.UserMapper;
import com.im.project.model.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-myBatis.xml" })
public class userServiceTest {
	@Resource
	UserMapper userDao;
	@Test
	public void testSaveUser() {
		User u=new User();
		u.setUserName("lala");
		u.setPassword("123");
		int i=userDao.insert(u);
		if(i!=1){
		fail("Not yet implemented");
		}
	}
	}
	
	
