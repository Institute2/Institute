package com.im.project.manager;


import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.im.project.manager.UserMapper;
import com.im.project.model.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml" })
public class UserServiceTest {
	@Resource
	UserMapper userDao;
	@Test
	public void testSaveUser() {
		User u=new User();
		u.setPassword("123");
		u.setUserName("werrwe");
		userDao.insert(u);
		User u1=userDao.selectByPrimaryKey(1);
		System.out.println(u1.getUserName()+"i=");
		/*if(i!=1){
		fail("Not yet implemented");
		}*/
	}
	}
	
	
