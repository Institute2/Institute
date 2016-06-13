package com.im.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.im.project.model.Project;
import com.im.project.service.ProjectService;
import com.im.project.utils.Page;
import static com.im.project.utils.ResultUtils.toResultMap;

@Controller("projectController")
@RequestMapping("/project")
public class ProjectController {
	@Resource
	private ProjectService projectService;

	@RequestMapping("/listallachieve.do")
	public Map<String, List<Project>> listProject(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map<String, List<Project>> dataMap = new HashMap<String, List<Project>>();
		dataMap = projectService.findProjectByType();
		return dataMap;
	}

	@RequestMapping("/morenotcompleted.do")
	public Map<String, Object> listDoingProject(Page page, int type, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		List<Project> projectList = new ArrayList<Project>();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		Map<String, Object> pageMap = new HashMap<String, Object>();
		pageMap.put("pageNow", page.getPageNow());
		pageMap.put("pageSize", page.getPageSize());
		projectList = projectService.findDoingProject(pageMap);
		dataMap.put("doingachieve", projectList);
		return toResultMap(dataMap);
	}

	@RequestMapping("/morecompletedachieve.do")
	public Map<String, Object> listCompletedProject(Page page, int type, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		List<Project> projectList = new ArrayList<Project>();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		Map<String, Object> pageMap = new HashMap<String, Object>();
		pageMap.put("pageNow", page.getPageNow());
		pageMap.put("pageSize", page.getPageSize());
		projectList = projectService.findCompletedProject(pageMap);
		dataMap.put("completedachieve", projectList);
		return toResultMap(dataMap);
	}

}
