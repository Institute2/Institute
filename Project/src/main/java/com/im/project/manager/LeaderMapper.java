package com.im.project.manager;

import java.util.ArrayList;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.im.project.model.Leader;
@Repository("leaderDao")
public interface LeaderMapper  extends BaseDao<Leader, Integer>{
	//查询所有的leader
	public ArrayList<Leader> selectAllLeaders(Map<String, Object> map);
}
