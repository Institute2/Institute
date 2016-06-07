package com.im.project.service;

import java.util.List;
import java.util.Map;

import com.im.project.model.Grad;

public interface GradService {
	public Grad findGrad(Integer id);
	public boolean delGrad(Integer id);
	public boolean addGrad(Grad grad);
	public boolean modifyGrad(Grad grad);
	/**
	 * 分页查找
	 * @param map
	 * @return
	 */
	public List<Grad> findGradByPage(Map<String ,Integer> map);
	/**
	 * 查询总共有多少条记录
	 * @return
	 */
	public Integer findRecords();
	
}
