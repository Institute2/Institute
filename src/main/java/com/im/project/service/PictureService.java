package com.im.project.service;

import java.util.List;
import java.util.Map;

import com.im.project.model.Picture;

public interface PictureService {
	public boolean addPicture(Picture pic);
	public Picture findPicture(Integer id);
	public boolean delPicture(Integer id);
	public boolean modifyPicture(Picture pic);
	public List<String> loadBigPic();
	public List<Picture> findPicByPage(Map<String, Object> picMap);
}
