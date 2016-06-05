package com.im.project.model;

public class Member {
	private Integer id;

	private String name;

	private Integer pictureId;

	private String jianjie;

	private String xibie;

	private String zhiwu;

	private Picture picture;
	public Integer getPictureId() {
		return pictureId;
	}

	public void setPictureId(Integer pictureId) {
		this.pictureId = pictureId;
	}



	public Integer getId() {
		return id;
	}

	public String getJianjie() {
		return jianjie;
	}

	public String getName() {
		return name;
	}

	public Picture getPicture() {
		return picture;
	}

	public String getXibie() {
		return xibie;
	}

	public String getZhiwu() {
		return zhiwu;
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
	public void setPicture(Integer pictureId) {
		this.pictureId = pictureId;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	public void setXibie(String xibie) {
		this.xibie = xibie;
	}
	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}
}
