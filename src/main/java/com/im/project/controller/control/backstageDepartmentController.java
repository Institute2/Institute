package com.im.project.controller.control;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.im.project.model.Department;
import com.im.project.service.DepartmentService;

@Controller("backstageDepartment")
@RequestMapping("/control/department")
public class backstageDepartmentController {
@Resource
private DepartmentService departmentService;
@RequestMapping("addDepartment")
public ModelAndView addDepartment(Department d,HttpServletRequest request,
		HttpServletResponse response) throws Exception{
	ModelAndView modelAndView = new ModelAndView();  
	boolean boo=departmentService.addDepartment(d);
	if(boo){
		modelAndView.addObject("msg", "success");
	}
	else{
		modelAndView.addObject("msg","failed");
	}
	return modelAndView;
	
}
@RequestMapping("delDepartment")
public ModelAndView delDepartment(int id,HttpServletRequest request,
		HttpServletResponse response) throws Exception{
	ModelAndView modelAndView = new ModelAndView();  
	boolean boo=departmentService.delDepartment(id);
	if(boo){
		modelAndView.addObject("msg", "success");
	}
	else{
		modelAndView.addObject("msg","failed");
	}
	return modelAndView;
	
}
@RequestMapping("modifyDepartment")
public ModelAndView modifyDepartment(Department d,HttpServletRequest request,
		HttpServletResponse response) throws Exception{
	ModelAndView modelAndView = new ModelAndView();  
	boolean boo=departmentService.modifyDepartment(d);
	if(boo){
		modelAndView.addObject("msg", "success");
	}
	else{
		modelAndView.addObject("msg","failed");
	}
	return modelAndView;
	
}
@RequestMapping("getDepartments")
public ModelAndView getDepartments(HttpServletRequest request,
		HttpServletResponse response) throws Exception{
	ModelAndView modelAndView = new ModelAndView("/control/department");  
	try{
	ArrayList<Department> list=(ArrayList<Department>)departmentService.findAllDepartment();
		modelAndView.addObject("msg", "success");
		modelAndView.addObject("list", list);
		
	}
	catch(Exception e){
		modelAndView.addObject("msg","failed");
	}
	return modelAndView;
	
}

}
