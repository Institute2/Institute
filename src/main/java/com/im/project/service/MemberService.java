package com.im.project.service;

import java.util.List;
import java.util.Map;

import com.im.project.model.Member;

public interface MemberService {
	public Member findMember(Integer id);
	public boolean addMember(Member mem);
	public boolean delMember(Integer id);
	public boolean modifyMember(Member mem);
	public Integer findrecords();
	public List<Member> findMemberByPage(Map<String ,Integer> map);
	
}
