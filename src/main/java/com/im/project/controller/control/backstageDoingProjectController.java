package com.im.project.controller.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.im.project.manager.ProjectMapper;
import com.im.project.model.Project;
import com.im.project.utils.JSONUtils;

@Controller("backstageDoingProject")
@RequestMapping("/control/doingProject")

public class backstageDoingProjectController {
@Resource 
private ProjectMapper projectDao;
@Resource
private backstageDoneProjectController backstageDoneProject;
@RequestMapping("/addDoingProject.do")
public ModelAndView addDoingProject(Project p,HttpServletRequest request,
		HttpServletResponse response){
	Map<String,Object> map=new HashMap<String,Object>();
	ModelAndView modelAndView=new ModelAndView();
	p.setType(1);
	int i=projectDao.insert(p);
	if(i==1){
		map.put("msg", "success");
	}
	else{
		map.put("msg", "failed");
	}
	 JSONUtils.toJSON(map, response);
	return modelAndView;
	}
@RequestMapping("/delDoingProject.do")
public ModelAndView delDoingProject(int id,HttpServletRequest request,
		HttpServletResponse response){
	Map<String,Object> map=new HashMap<String,Object>();
	ModelAndView modelAndView=new ModelAndView();
	int i=projectDao.deleteByPrimaryKey(id);
	if(i==1){
		map.put("msg", "success");
	}
	else{
	modelAndView.addObject("msg", "failed");
	}
	return modelAndView;
	}
@RequestMapping("/modifyDoingProject.do")
public ModelAndView modifyDoingProject(Project p,HttpServletRequest request,
		HttpServletResponse response){
	Map<String,Object> map=new HashMap<String,Object>();
	ModelAndView modelAndView=new ModelAndView("control/doingProject");
	Map<String,Object> map=new HashMap<String,Object>();
	int i=projectDao.updateByPrimaryKey(p);
	if(i==1){
		modelAndView.addObject("msg", "success");
	}
	else{
	modelAndView.addObject("msg", "failed");
	}
	 JSONUtils.toJSON(map, response);
	return modelAndView;
	}
@RequestMapping("/getDoingProjects.do")
public ModelAndView getDoingProjects(HttpServletRequest request,
		HttpServletResponse response){
	Map<String,Object> map=new HashMap<String,Object>();
	System.out.println("lalal");
	ModelAndView modelAndView=new ModelAndView("control/doingProject");
	try{
	ArrayList<Project> list=(ArrayList<Project>)projectDao.selectAllDoing();
	System.out.println("lalal"+list.size());
	modelAndView.addObject("msg", "success");
	modelAndView.addObject("list", list);
	}
	catch(Exception e){
	modelAndView.addObject("msg","failed");
	e.printStackTrace();
	}
	
	return modelAndView;
	}
@RequestMapping("/validate")
public void validate(Project p,HttpServletRequest request,
		HttpServletResponse response){
	Map<String,Object> map=new HashMap<String,Object>();
	
	backstageDoneProject.addDoneProject(p,request,response);
}





}
