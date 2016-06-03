package com.im.project.model;

import java.util.Date;

public class Project {
	private Integer id;
	private String title;
	private String content;
	private String leader;
	private Date startline;
	private Date deadline;
	private Integer type;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader == null ? null : leader.trim();
	}

	public Date getStartline() {
		return startline;
	}

	public void setStartline(Date startline) {
		this.startline = startline;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
