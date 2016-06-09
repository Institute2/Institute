package com.im.project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.project.manager.LeaderMapper;
import com.im.project.model.Leader;
import com.im.project.service.LeaderService;
@Service("leaderService")
public class LeaderServiceImpl implements LeaderService {
	@Resource 
	private LeaderMapper leaderDao;
	public Leader findLeader(Integer id) {
		// TODO Auto-generated method stub
		Leader lead=new Leader();
		if(id>0&&id<Integer.MAX_VALUE){
			lead=leaderDao.selectByPrimaryKey(id);
		}
		return lead;
	}

	public boolean addLeader(Leader leader) {
		// TODO Auto-generated method stub
		boolean boo=false;
		if(leader!=null){
			int i= leaderDao.insert(leader);
			if(i==1){
				boo=true;
			}
		}
		return boo;
	}

	public boolean delLeader(Integer id) {
		// TODO Auto-generated method stub
		boolean boo=false;
		if(id>0&&id<Integer.MAX_VALUE){
			int i=leaderDao.deleteByPrimaryKey(id);
			if(i==1){
				boo=true;
			}
		}
		return boo;
	}

	public boolean modifyLeader(Leader leader) {
		// TODO Auto-generated method stub
		boolean boo=false;
		if(leader!=null){
			int i=leaderDao.updateByPrimaryKey(leader);
			if(i==1){
				boo=true;
			}
		}
		return boo;
	}

	public List<Leader> findLeaderByPage(Map<String, Object> map) {
		// TODO Auto-generated method stub
		List<Leader> leaderList =new ArrayList<Leader>();
		leaderList=leaderDao.findAll(map);
		return leaderList;
	}

	public int findrecords() {
		// TODO Auto-generated method stub
		int i=0;
		i=leaderDao.countRecords();
		return i;
	}

}
