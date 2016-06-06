/*package com.im.project.service.impl;

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
		if(project!=null){
			projectDao.insert(project);
			return true;
		}
		return false;
	}

	public Project findProject(Integer id) {
		// TODO Auto-generated method stub
		Project pro =null;
		if(id>0&&id<Integer.MAX_VALUE){
			pro=projectDao.selectByPrimaryKey(id);
		}
		return pro;
	}

	public boolean delProject(Integer id) {
		// TODO Auto-generated method stub
		boolean boo=false;
		
		if(id>0&&id<Integer.MAX_VALUE){
			projectDao.deleteByPrimaryKey(id);
			boo=true;
		}
		return boo;
	}

	public boolean modifyProject(Project project) {
		// TODO Auto-generated method stub
		boolean boo=false;
		if(project!=null){
			projectDao.updateByPrimaryKey(project);
			boo=true;
			
		}
		
		return boo;
	}
*//**
 * 将执行两次查询，并将两次查询结果添加到map中返回
 *//*
	public Map<String, List<Project>> findProjectByType() {
		// TODO Auto-generated method stub
		Map<String, List<Project>> twoTypeList = null;
		List<Project> doingProList = null;
		List<Project> completedProList = null;
		doingProList = projectDao.findAllByType(1);
		completedProList = projectDao.findAllByType(2);
		twoTypeList.put("completedachieve", completedProList);
		twoTypeList.put("doingdachieve", doingProList);
		return twoTypeList;

	}

	public List<Project> findDoingProject(Map<String, Object> projectMap) {
		// TODO Auto-generated method stub
		List<Project> proList=null;
		if(projectMap!=null){
			proList=projectDao.findAllDoing(projectMap);
		}
		
		return proList;
	}

	public List<Project> findCompletedProject(Map<String, Object> projectMap) {
		// TODO Auto-generated method stub
		List<Project> proList=null;
		if(projectMap!=null){
			proList=projectDao.findAllCompleted(projectMap);
		}
		return proList;
		
	}

}
*/