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

import com.im.project.model.News;
import com.im.project.service.NewsService;
import com.im.project.utils.Page;

@Controller("newsController")
@RequestMapping("/news")
public class NewsController {
	@Resource
	private NewsService newsService;

	@RequestMapping("/listNews.do")
	public Map<String, Object> listNews(String identify, Page page, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		List<News> newsList = new ArrayList<News>();
		if (identify != null && identify == "index") {
			newsList = newsService.findNewsIndex();
		} else if (identify == "news") {
			Map<String, Object> pageMap = new HashMap<String, Object>();
			pageMap.put("pageNow", page.getPageNow());
			pageMap.put("pageSize", page.getPageSize());
			newsList = newsService.findNewsByPage(pageMap);
		}
		//String 
		dataMap.put("newsList", newsList);
		return dataMap;
	}

	@RequestMapping("/checkNews.do")
	public Map<String, Object> checkNews(int id) throws Exception {

		Map<String, Object> dataMap = new HashMap<String, Object>();
		News news = newsService.findNews(id);
		dataMap.put("news", news);
		return dataMap;
	}

}
