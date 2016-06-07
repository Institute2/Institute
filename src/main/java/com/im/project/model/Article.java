package com.im.project.model;

import java.util.Date;

public class Article {
	private Integer id;
	private String title;
	private String content;
	private String date;
	private String author;
	private String keyword;
    private String summary;
	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}
	

	public Integer getId() {
		return id;
	}
	
	public String getKeyword() {
		return keyword;
	}


	public String getSummary() {
		return summary;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setContent(String content) {
		this.content = content==null?null:content.trim();
	}

	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setTitle(String title) {
		this.title = title==null?null:title.trim();
	}

}
