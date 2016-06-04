package com.im.project.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.im.project.manager.ProjectMapper;
import com.im.project.model.Project;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-myBatis.xml" })
public class ProjectServiceImplTest {
	@Resource
	ProjectMapper projectDao;
	
	@Test
	public void testSaveProject() {
		Project project=new Project();
		//project.setId(1);
		project.setTitle("121123");
		project.setContent("123");
		project.setLeader("123");
		projectDao.insert(project);
		//projectDao.deleteByPrimaryKey(1);
		fail("Not yet implemented");
	}
//	@Test
//	public void testSelectProject() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteProject() {
//		fail("Not yet implemented");
//	}

}
