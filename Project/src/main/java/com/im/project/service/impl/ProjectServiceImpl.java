package com.im.project.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.project.manager.ProjectMapper;
import com.im.project.model.Project;
import com.im.project.service.ProjectService;
@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
	
	@Resource
	private ProjectMapper projectDao;

	public boolean addProject(Project project) {
		// TODO Auto-generated method stub
		if(project!=null){
			projectDao.insert(project);
			return true;
		}else{
			return false;
			
		}
		
		
	}

	public Project findProject(Integer id) {
		// TODO Auto-generated method stub
		if(id==0||id<0){
			return null;
		}else if(id<Integer.MAX_VALUE){
			return 	projectDao.selectByPrimaryKey(id);
			
		}else{
			return null; 
		}
		
		
	}

	public boolean delProject(Integer id) {
		// TODO Auto-generated method stub
		if(id==0||id<0){
			return false;
		}else if(id<Integer.MAX_VALUE){
			projectDao.deleteByPrimaryKey(id);
			return true;
		}else{
			return false; 
		}
	}

	public boolean modifyProject(Project project) {
		// TODO Auto-generated method stub
		if(project!=null){
			projectDao.updateByPrimaryKey(project);
			return true;
		}else{
			return false;
		}
	}

	public List<Project> findProjectByType() {
		// TODO Auto-generated method stub
		Map<String,Object> projectMap;
	
	//	projectDao.findAllByType(projectMap, 1);
		return null;
	}

	public List<Project> findDoingProject() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Project> findCompletedProject() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
