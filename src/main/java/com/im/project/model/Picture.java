package com.im.project.model;

import java.util.Date;

public class Picture {
	private Integer id ;
	private String link;
	private String date;
	private Integer type;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link==null?null:link.trim();
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type==null?null:type;
	}
	
	
	
}
