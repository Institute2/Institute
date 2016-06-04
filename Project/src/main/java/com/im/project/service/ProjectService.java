package com.im.project.service;

import java.util.List;
import java.util.Map;

import com.im.project.model.Project;

public interface ProjectService {
	/**
	 * 保存实体
	 * @param project实体
	 */
	public boolean addProject(Project project);
	/**
	 * 根据主键查询实体
	 * @param id实体主键
	 * @return
	 */
	public Project findProject(Integer id);
	/**
	 * 删除实体
	 * @param id 实体主键
	 */
	public boolean delProject(Integer id);
	/**
	 * 修改实体
	 * @param project所要修改的实体
	 */
	public boolean modifyProject(Project project);
	/**
	 * 同时查询两种类型的项目
	 * @return 两种类型的结果集的集合
	 */
	public List<Project> findProjectByType();
	/**
	 * 分页查询未完成的项目
	 * @return结果集
	 */
	public List<Project> findDoingProject();
	/**
	 * 分页查询已经完成的项目
	 * @return 结果集
	 */
	public List<Project> findCompletedProject();
	
	
}
