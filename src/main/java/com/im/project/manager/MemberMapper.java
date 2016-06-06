package com.im.project.manager;

import java.util.Map;

import org.springframework.stereotype.Repository;



import com.im.project.model.Member;
@Repository("memberDao")
public interface MemberMapper extends BaseDao<Member, Integer>{
	
}
