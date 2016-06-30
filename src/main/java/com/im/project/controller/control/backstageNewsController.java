package com.im.project.controller.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.im.project.manager.NewsMapper;
import com.im.project.model.News;
import com.im.project.utils.JSONUtils;

@Controller("backstageNews")
@RequestMapping("/control/news")
public class backstageNewsController {
@Resource
private NewsMapper newsDao;
@RequestMapping("/addNews")
public ModelAndView addNews(News n,HttpServletRequest request,
		HttpServletResponse response){
	ModelAndView modelAndView =new ModelAndView("control/addNews");
	Map<String,Object> map=new HashMap<String,Object>();
	try{
	int i=newsDao.insert(n);
	if(i==1){
		map.put("msg", "success");
	}
	else{
		map.put("msg", "failed");
	}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	JSONUtils.toJSON(map, response);
	return modelAndView;
}
@RequestMapping("/delNews")
public ModelAndView delNews(int id,HttpServletRequest request,
		HttpServletResponse response){
	ModelAndView modelAndView =new ModelAndView("control/news");
	Map<String,Object> map=new HashMap<String,Object>();
	
	
	try{
		int i=newsDao.deleteByPrimaryKey(id);
		if(i==1){
			map.put("msg", "success");
		}
		else{
			map.put("msg", "failed");
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	JSONUtils.toJSON(map, response);
	return modelAndView;
}
@RequestMapping("/modifyNews")
public ModelAndView updateNews(News n,HttpServletRequest request,
		HttpServletResponse response){
	ModelAndView modelAndView =new ModelAndView("control/updateNews");
	Map<String,Object> map=new HashMap<String,Object>();
	try{
		int i=newsDao.updateByPrimaryKey(n);
		if(i==1){
			map.put("msg", "success");
		}
		else{
			map.put("msg", "failed");
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	JSONUtils.toJSON(map, response);
	return modelAndView;
}
@RequestMapping("/getNews")
public ModelAndView getNews(HttpServletRequest request,
		HttpServletResponse response){
	ModelAndView modelAndView =new ModelAndView("/control/news");
	Map<String,Object> map=new HashMap<String,Object>();
	try{
		ArrayList<News> list=(ArrayList<News>)newsDao.selectAll();
		map.put("msg", "success");
		modelAndView.addObject("list",list);
	}
	catch(Exception e){	
		map.put("msg", "failed");
}
	JSONUtils.toJSON(map, response);
	return modelAndView;
}
@RequestMapping("/getSingleNews")
public ModelAndView getSingleNews(int id,HttpServletRequest request,
		HttpServletResponse response){
	ModelAndView modelAndView =new ModelAndView("control/updateNews");
	Map<String,Object> map=new HashMap<String,Object>();
	try{
		News news=newsDao.selectByPrimaryKey(id);
		map.put("msg", "success");
		modelAndView.addObject("news",news);
		}
	catch(Exception e){	
		map.put("msg", "failed");
	}
		JSONUtils.toJSON(map, response);
		return modelAndView;
}

}



