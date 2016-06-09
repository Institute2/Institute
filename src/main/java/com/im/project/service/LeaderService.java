package com.im.project.service;

import java.util.List;
import java.util.Map;

import com.im.project.model.Leader;

public interface LeaderService {
	public Leader findLeader(Integer id);
	public boolean addLeader(Leader leader);
	public boolean delLeader(Integer id);
	public boolean modifyLeader(Leader leader);
	/**
	 * 分页查找
	 * @param map
	 * @return
	 */
	public List<Leader> findLeaderByPage(Map<String ,Object> map);
	/**
	 * 查询所有的记录条数
	 * @return
	 */
	public int  findrecords();
}
