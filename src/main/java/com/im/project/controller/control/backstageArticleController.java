package com.im.project.controller.control;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.im.project.manager.ArticleMapper;
import com.im.project.model.Article;

@Controller("backstageArticle")
@RequestMapping("/control/article")
public class backstageArticleController {
	@Resource
	private ArticleMapper articleDao;
	@RequestMapping("addArticle")
	public ModelAndView addArticle(Article a){
	ModelAndView modelAndView = new ModelAndView();  
	 int i=articleDao.insert(a);
	 if(i==1){
	 
     modelAndView.addObject("msg", "success");  
	 }
	 else{
	modelAndView.addObject("msg", "failed");   
	 }
     return modelAndView;   
	}
	@RequestMapping("delArticle")
	public ModelAndView delArticle(int id){
		ModelAndView modelAndView = new ModelAndView();  
		 int i=articleDao.deleteByPrimaryKey(id);
		 if(i==1){
		 
	     modelAndView.addObject("msg", "success");  
		 }
		 else{
		modelAndView.addObject("msg", "failed");   
		 }
	     return modelAndView;   
		}
	@RequestMapping("modifyArticle")
	public ModelAndView modifyArticle(Article a){
		ModelAndView modelAndView = new ModelAndView();  
		 int i=articleDao.updateByPrimaryKey(a);
		 if(i==1){
	     modelAndView.addObject("msg", "success");  
		 }
		 else{
		modelAndView.addObject("msg", "failed");   
		 }
	     return modelAndView;   
		}
	@RequestMapping("selectArticles")
	public ModelAndView selectArticles(){
		ModelAndView modelAndView = new ModelAndView("/control/news.jsp"); 
		try{
		ArrayList<Article> list=(ArrayList<Article>)articleDao.selectAll();
		 modelAndView.addObject("msg", "success");
		 modelAndView.addObject("list", list); 
		}
		catch(Exception e){
		 modelAndView.addObject("msg", "failed");   
		}
	     return modelAndView;   
		}
	@RequestMapping("selectArticle")
	public ModelAndView selectArticle(int id){
		ModelAndView modelAndView = new ModelAndView("/control/updateNews.jsp"); 
		try{
		Article a=articleDao.selectByPrimaryKey(id);
		 modelAndView.addObject("msg", "success");
		 modelAndView.addObject("article", a); 
		}
		catch(Exception e){
		 modelAndView.addObject("msg", "failed");   
		}
	     return modelAndView;   
		}
}
