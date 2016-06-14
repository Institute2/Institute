package com.im.project.controller.control;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.im.project.manager.ProjectMapper;
import com.im.project.model.Project;

@Controller("backstageDoneProject")
@RequestMapping("/control/doneProject")
public class backstageDoneProjectController {
	@Resource 
	private ProjectMapper projectDao;

	@RequestMapping("addDoneProject")
	public ModelAndView addDoneProject(Project p){
		ModelAndView modelAndView=new ModelAndView();
		p.setType(2);
		int i=projectDao.insert(p);
		if(i==1){
			modelAndView.addObject("msg", "success");
		}
		else{
		modelAndView.addObject("msg", "failed");
		}
		return modelAndView;
		}
	@RequestMapping("delDoneProject")
	public ModelAndView delDoneProject(int id){
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
	@RequestMapping("modifyDoneProject")
	public ModelAndView modifyDoneProject(Project p){
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
	@RequestMapping("getDoneProjects")
	public ModelAndView getDoneProjects(){
		ModelAndView modelAndView=new ModelAndView("/control/doneProject.jsp");
		try{
		ArrayList<Project> list=(ArrayList<Project>)projectDao.selectAllCompleted();
		
		modelAndView.addObject("msg", "success");
		modelAndView.addObject("list", list);
		
		}
		catch(Exception e){
		modelAndView.addObject("msg","failed");
		}
		return modelAndView;
		}
	
	
	
	
	
}
