package com.im.project.service;

import java.util.List;
import java.util.Map;

import com.im.project.model.Project;

public interface ProjectService {
	
	/**
	 * 添加项目		
	 * @param project 项目实体
	 * @return 成功与否
	 */
	public boolean addProject(Project project);
	/**
	 * 通过id查找项目
	 * @param id 项目id
	 * @return 结果集
	 */
	public Project findProject(Integer id);
	/**
	 * 通过id删除项目
	 * @param id 项目id
	 * @return 成功与否
	 */
	public boolean delProject(Integer id);
	/**
	 * 修改项目
	 * @param project 项目实体
	 * @return 成功与否
	 */
	public boolean modifyProject(Project project);
	/**
	 * 根据不同的项目类型分类查找，再组成一个map
	 * @return 结果集
	 */
	
	
	public Map<String, List<Project>> findProjectByType();
	/**
	 * 分页查找未完成的项目
	 * @param projectMap 所要查找的记录条的页参数
	 * @return 结果集
	 */
	public List<Project> findDoingProject(Map<String, Object> projectMap);
	/**
	 * 分页查找已完成的项目
	 * @param projectMap 所要查找的记录条的页参数
	 * @return 结果集
	 */
	public List<Project> findCompletedProject(Map<String, Object> projectMap);
}
