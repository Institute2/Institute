package com.im.project.model;

public class Grad {
	private Integer id;
	private String name;
	private Integer pictureId;
	private String jianjieId;
	private String xibie;
	private String grade;
	private String zhiwu;
	private String whereabout;
	private Picture picture;
	public String getGrade() {
		return grade;
	}

	public Integer getId() {
		return id;
	}


	public String getJianjieId() {
		return jianjieId;
	}

	public void setJianjieId(String jianjieId) {
		this.jianjieId = jianjieId;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public String getName() {
		return name;
	}

	
	public String getWhereabout() {
		return whereabout;
	}

	public String getXibie() {
		return xibie;
	}

	public String getZhiwu() {
		return zhiwu;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public void setName(String name) {
		this.name = name;
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

	public void setWhereabout(String whereabout) {
		this.whereabout = whereabout;
	}

	public void setXibie(String xibie) {
		this.xibie = xibie;
	}

	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}
	
}
