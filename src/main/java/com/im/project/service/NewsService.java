package com.im.project.service;

import java.util.List;
import java.util.Map;

import com.im.project.model.News;

public interface NewsService {
	public News findNews(Integer id);
	public boolean delNews(Integer id);
	public boolean modifyNews(News news);
	public boolean addNews(News news);
	public List<News> findNewsIndex();
	public List<News> findNewsByPage(Map<String ,Object> map);
	
}
