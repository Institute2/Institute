package com.im.project.manager.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.im.project.manager.ProjectMapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-myBatis.xml" })
public class ProjectDaoTest {
	@Test
	public void test() {
		ProjectMapper pm;
		fail("Not yet implemented");
	}

}
