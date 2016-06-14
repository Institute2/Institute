package com.im.project.controller.control;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.im.project.manager.ProjectMapper;
import com.im.project.model.Project;

@Controller("backstageDoingProject")
@RequestMapping("/control/doingProject")
public class backstageDoingProjectController {
@Resource 
private ProjectMapper projectDao;
@Resource
private backstageDoneProjectController backstageDoneProject;
@RequestMapping("addDoingProject")
public ModelAndView addDoingProject(Project p){
	ModelAndView modelAndView=new ModelAndView();
	p.setType(1);
	int i=projectDao.insert(p);
	if(i==1){
		modelAndView.addObject("msg", "success");
	}
	else{
	modelAndView.addObject("msg", "failed");
	}
	return modelAndView;
	}
@RequestMapping("delDoingProject")
public ModelAndView delDoingProject(int id){
	ModelAndView modelAndView=new ModelAndView();
	int i=projectDao.deleteByPrimaryKey(id);
	if(i==1){
		modelAndView.addObject("msg", "success");
	}
	else{
	modelAndView.addObject("msg", "failed");
	}
	return modelAndView;
	}
@RequestMapping("modifyDoingProject")
public ModelAndView modifyDoingProject(Project p){
	ModelAndView modelAndView=new ModelAndView();
	int i=projectDao.updateByPrimaryKey(p);
	if(i==1){
		modelAndView.addObject("msg", "success");
	}
	else{
	modelAndView.addObject("msg", "failed");
	}
	return modelAndView;
	}
@RequestMapping("getDoingProjects")
public ModelAndView getDoingProjects(){
	ModelAndView modelAndView=new ModelAndView("/control/doingProject");
	try{
	ArrayList<Project> list=(ArrayList<Project>)projectDao.selectAllDoing();
	
	modelAndView.addObject("msg", "success");
	modelAndView.addObject("list", list);
	
	}
	catch(Exception e){
	modelAndView.addObject("msg","failed");
	}
	return modelAndView;
	}
@RequestMapping("/validate")
public void validate(Project p){
	
	backstageDoneProject.addDoneProject(p);
}





}
