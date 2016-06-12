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

import com.im.project.model.Article;
import com.im.project.service.ArticleService;
import com.im.project.utils.Page;

@Controller("articleController")
@RequestMapping("/article")
public class ArticleController {
	@Resource
	private ArticleService articleService;
	@RequestMapping(value="/listArticle.do")
	public Map<String, Object> listArticleIndex(Page page,String identify,
			HttpServletRequest request,HttpServletResponse response) throws Exception{
		List<Article> articleList=new ArrayList<Article>();
		Map<String,Object> dataMap =new HashMap<String,Object>();
		if(identify!=null&&identify=="index"){
			articleList=articleService.findArticleIndex();
		}else if(identify=="article"){
			Map<String ,Object> pageMap=new HashMap<String,Object>();
			pageMap.put("pageNow",page.getPageNow());
			pageMap.put("pageSize", page.getPageSize());
			articleList=articleService.findArticle(pageMap);
		}
		dataMap.put("articleList",articleList );
		return dataMap;
	}
	
	@RequestMapping(value="/checkArticle.do")
	public Article checkArticle(int id,HttpServletRequest request,HttpServletResponse response) throws Exception{
		Article art=null;
		if(id>0&&id<Integer.MAX_VALUE){
			art=articleService.findArticle(id);
		}
		return art;
	}
	
	
}
