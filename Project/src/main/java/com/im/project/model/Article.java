package com.im.project.model;

import java.util.Date;

public class Article {
	private Integer id;
	private String title;
	private String content;
	private Date date;
	private String author;
	private String keywords;
    private String summary;
	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}
	public Date getDate() {
		return date;
	}

	public Integer getId() {
		return id;
	}
	
	public String getKeywords() {
		return keywords;
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

	public void setDate(Date date) {
		this.date = date;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setTitle(String title) {
		this.title = title==null?null:title.trim();
	}

}
