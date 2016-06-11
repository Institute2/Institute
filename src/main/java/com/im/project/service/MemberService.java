package com.im.project.service;

import java.util.List;
import java.util.Map;

import com.im.project.model.Member;

public interface MemberService {
	public Member findMember(Integer id)throws Exception;
	public boolean addMember(Member mem)throws Exception;
	public boolean delMember(Integer id)throws Exception;
	public boolean modifyMember(Member mem)throws Exception;
	public int findRecords()throws Exception;
	public List<Member> findMemberByPage(Map<String ,Object> map)throws Exception;
	
}
