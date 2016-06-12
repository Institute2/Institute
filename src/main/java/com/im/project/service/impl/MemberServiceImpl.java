package com.im.project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.project.manager.MemberMapper;
import com.im.project.model.Member;
import com.im.project.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Resource
	private MemberMapper memberDao;

	public Member findMember(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Member member = new Member();
		if (id > 0 && id < Integer.MAX_VALUE) {
			member = memberDao.selectByPrimaryKey(id);
		}
		return member;
	}

	public boolean addMember(Member mem) throws Exception {
		// TODO Auto-generated method stub
		boolean boo = false;
		if (mem != null) {
			int i = memberDao.insert(mem);
			if (i == 1) {
				boo = true;
			}
		}
		return boo;
	}

	public boolean delMember(Integer id) throws Exception {
		// TODO Auto-generated method stub
		boolean boo = false;
		if (id > 0 && id < Integer.MAX_VALUE) {
			int i = memberDao.deleteByPrimaryKey(id);
			if (i == 1) {
				boo = true;
			}
		}
		return boo;
	}

	public boolean modifyMember(Member mem) throws Exception {
		// TODO Auto-generated method stub
		boolean boo = false;
		if (mem != null) {
			int i = memberDao.updateByPrimaryKey(mem);
			if (i == 1) {
				boo = true;
			}
		}
		return boo;
	}

	public int findRecords() throws Exception {
		int i = 0;
		i = memberDao.countRecords();

		return i;

	}

	public List<Member> findMemberByPage(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		List<Member> memberList = new ArrayList<Member>();
		if (map != null) {
			memberList = memberDao.findAll(map);
		}
		return memberList;
	}

}
