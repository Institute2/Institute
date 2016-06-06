package com.im.project.model;

public class Leader {
	private Integer id;
	private String name;
	private String zhicheng;
	private Integer pictureId;
	private String jianjie;
	private String xibie;
	private Picture picture;
	public Integer getId() {
		return id;
	}

	public String getJianjie() {
		return jianjie;
	}

	public String getName() {
		return name;
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

	public String getXibie() {
		return xibie;
	}

	public String getZhicheng() {
		return zhicheng;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void setXibie(String xibie) {
		this.xibie = xibie;
	}

	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	
}
