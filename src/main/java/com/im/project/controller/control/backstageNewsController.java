package com.im.project.controller.control;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.im.project.manager.NewsMapper;
import com.im.project.model.News;

@Controller("backstageNews")
@RequestMapping("/control/news")
public class backstageNewsController {
@Resource
private NewsMapper newsDao;
@RequestMapping("/addNews")
public ModelAndView addNews(News n,HttpServletRequest request,
		HttpServletResponse response){
	ModelAndView modelAndView =new ModelAndView();
	int i=newsDao.insert(n);
	if(i==1){
		modelAndView.addObject("msg", "success");
	}
	else{
	modelAndView.addObject("msg", "failed");
	}
	
	return modelAndView;
}
@RequestMapping("/delNews")
public ModelAndView delNews(int id,HttpServletRequest request,
		HttpServletResponse response){
	ModelAndView modelAndView =new ModelAndView();
	int i=newsDao.deleteByPrimaryKey(id);
	if(i==1){
		modelAndView.addObject("msg", "success");
	}
	else{
	modelAndView.addObject("msg", "failed");
	}
	
	return modelAndView;
}
@RequestMapping("/modifyNews")
public ModelAndView updateNews(News n,HttpServletRequest request,
		HttpServletResponse response){
	ModelAndView modelAndView =new ModelAndView();
	int i=newsDao.updateByPrimaryKey(n);
	if(i==1){
		modelAndView.addObject("msg", "success");
	}
	else{
	modelAndView.addObject("msg", "failed");
	}
	
	return modelAndView;
}
@RequestMapping("/getNews")
public ModelAndView getNews(HttpServletRequest request,
		HttpServletResponse response){
	ModelAndView modelAndView =new ModelAndView("/control/news.jsp");
	try{
	ArrayList<News> list=(ArrayList<News>)newsDao.selectAll();
		modelAndView.addObject("msg", "success");
		modelAndView.addObject("list",list);
	}
catch(Exception e){	
	modelAndView.addObject("msg", "failed");
}
	return modelAndView;
}
@RequestMapping("/getSingleNews")
public ModelAndView getSingleNews(int id,HttpServletRequest request,
		HttpServletResponse response){
	ModelAndView modelAndView =new ModelAndView();
	try{
	News news=newsDao.selectByPrimaryKey(id);
			modelAndView.addObject("msg", "success");
			modelAndView.addObject("news",news);
		}
	catch(Exception e){	
		modelAndView.addObject("msg", "failed");
	}
		return modelAndView;
}

}



