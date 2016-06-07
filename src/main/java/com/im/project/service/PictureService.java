package com.im.project.service;

import java.util.List;
import java.util.Map;

import com.im.project.model.Picture;

public interface PictureService {
	/**
	 * 添加图片
	 * @param pic 图片实体
	 * @return 成功与否
	 */
	public boolean addPicture(Picture pic);
	/**
	 * 根据主键查找图片
	 * @param id 图片id
	 * @return 结果集
	 */
	public Picture findPicture(Integer id);
	/**
	 * 根据主键删除图片
	 * @param id 图片id
	 * @return 成功与否
	 */
	public boolean delPicture(Integer id);
	/**
	 * 修改图片
	 * @param pic 图片实体
	 * @return 成功与否
	 */
	public boolean modifyPicture(Picture pic);
	/**
	 * 加载首页三张大图
	 * @return 结果集
	 */
	public List<String> loadBigPic();
	/**
	 * 分页查找图片
	 * @param picMap 要查找的页数信息
	 * @return 结果集
	 */
	public List<Picture> findPicByPage(Map<String, Object> picMap);
}
