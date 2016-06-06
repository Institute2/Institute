package com.im.project.manager;


import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.im.project.manager.ProjectMapper;
import com.im.project.model.Project;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml" })
public class ProjectServiceImplTest {
	@Resource
	ProjectMapper projectDao;
	@Test
	public void testSaveProject() {
		//Project project=new Project();
		//project.setId(1);
		//project.setTitle("121123");
		//project.setContent("123");
		//project.setLeader("123");
		Project p=projectDao.selectByPrimaryKey(1);
		
		
		System.out.println("project"+p.getTitle());
		//projectDao.deleteByPrimaryKey(1);
		if(p==null){
		fail("Not yet implemented");
		}
	}

}
