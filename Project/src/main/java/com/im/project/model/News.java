package com.im.project.model;

import java.util.Date;

public class News {
	private Integer id;
	private String title;
	private String content;
	private Integer pictureId;
	private Date date;
	private String author;
    private String releaser;
    private String summary;
    private Picture picture;
	public String getAuthor() {
		return author;
	}

	public Integer getPictureId() {
		return pictureId;
	}

	public void setPictureId(Integer pictureId) {
		this.pictureId = pictureId;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
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

	public String getReleaser() {
		return releaser;
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
		this.content = content == null ? null : content.trim();
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public void setReleaser(String releaser) {
		this.releaser = releaser;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

}
