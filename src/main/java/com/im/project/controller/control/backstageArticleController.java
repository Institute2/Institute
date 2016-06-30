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

import com.im.project.manager.ArticleMapper;
import com.im.project.model.Article;
import com.im.project.utils.JSONUtils;

@Controller("backstageArticle")
@RequestMapping("/control/article")
public class backstageArticleController {
	@Resource
	private ArticleMapper articleDao;
	@RequestMapping("addArticle")
	public ModelAndView addArticle(Article a,HttpServletRequest request,
			HttpServletResponse response){
	Map<String,Object> map=new HashMap<String,Object>();
	ModelAndView modelAndView = new ModelAndView("control/addPapers"); 
	try{
	 int i=articleDao.insert(a);
	 if(i==1){
     map.put("msg", "success");  
	 }
	 else{
	map.put("msg", "failed");   
	 	}
	}
	catch(Exception e){
		e.printStackTrace();
		map.put("msg", "failed");
	}
	 JSONUtils.toJSON(map, response);
     return modelAndView;   
	}
	@RequestMapping("delArticle")
	public ModelAndView delArticle(int id,HttpServletRequest request,
			HttpServletResponse response){
		Map<String,Object> map=new HashMap<String,Object>();
		ModelAndView modelAndView = new ModelAndView("control/papers");  
		
		 try{
			 int i=articleDao.deleteByPrimaryKey(id);
			 if(i==1){
		     map.put("msg", "success");  
			 }
			 else{
			map.put("msg", "failed");   
			 	}
			}
			catch(Exception e){
				e.printStackTrace();
				map.put("msg", "failed");
			}
		 JSONUtils.toJSON(map, response);
	     return modelAndView;   
		}
	@RequestMapping("modifyArticle")
	public ModelAndView modifyArticle(Article a,HttpServletRequest request,
			HttpServletResponse response){
		Map<String,Object> map=new HashMap<String,Object>();
		ModelAndView modelAndView = new ModelAndView();  
		 
		 try{
			 int i=articleDao.updateByPrimaryKey(a);
			 if(i==1){
		     map.put("msg", "success");  
			 }
			 else{
			map.put("msg", "failed");   
			 	}
			}
			catch(Exception e){
				e.printStackTrace();
				map.put("msg", "failed");
			}
		 JSONUtils.toJSON(map, response);
	     return modelAndView;   
		}
	@RequestMapping("getArticles")
	public ModelAndView getArticles(HttpServletRequest request,
			HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView("/control/papers"); 
		try{
		ArrayList<Article> list=(ArrayList<Article>)articleDao.selectAll();
		 modelAndView.addObject("list", list); 
		}
		catch(Exception e){
			e.printStackTrace();
		}
	     return modelAndView;   
		}
	@RequestMapping("getArticle")
	public ModelAndView selectArticle(int id,HttpServletRequest request,
			HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView("/control/updatePapers"); 
		try{
		Article a=articleDao.selectByPrimaryKey(id);
		 modelAndView.addObject("article", a); 
		}
		catch(Exception e){
			e.printStackTrace();
		}
	     return modelAndView;   
		}
}
