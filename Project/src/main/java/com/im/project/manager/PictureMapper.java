package com.im.project.manager;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.im.project.model.Picture;

@Repository("pictureDao")
public interface PictureMapper extends BaseDao<Picture, Integer> {
	/**
	 * 查询出前三条对应记录
	 * 
	 * @return 结果集
	 */
	public List<Picture> listPic();

	/**
	 * 分不同的类型分页查找
	 * 
	 * @param map
	 *            封装type，pageId，pageSize
	 * @return 结果集
	 */
	public List<Picture> selectByType(Map<String, Object> map);
}
