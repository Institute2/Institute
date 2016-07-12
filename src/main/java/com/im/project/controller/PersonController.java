package com.im.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.im.project.model.Grad;
import com.im.project.model.Leader;
import com.im.project.model.Member;
import com.im.project.service.GradService;
import com.im.project.service.LeaderService;
import com.im.project.service.MemberService;
import com.im.project.utils.Page;

@Controller("personController")
@RequestMapping("/person")
public class PersonController {
	@Resource
	private LeaderService leaderService;
	@RequestMapping(value="/listLeader.do")
	public Map<String,Object> listLeader(Page page,HttpServletRequest request,HttpServletResponse response) throws Exception{
		Map<String,Object> dataMap =new HashMap<String,Object>();
		Map<String,Object> pageMap =new HashMap<String,Object>();
		int pageSum=-1;
		pageMap.put("pageSize", (page.getPageSize()<=0)?0:page.getPageSize());
		pageMap.put("pageNow", (page.getPageNow()<=0)?0:(page.getPageNow()-1)*page.getPageSize());
		if(pageSum==-1 && page.getPageSize()!=0){
			pageSum=leaderService.findrecords()/page.getPageSize()+1;
		}
		List<Leader> personList=new ArrayList<Leader>();
		personList=leaderService.findLeaderByPage(pageMap);
		dataMap.put("person", personList);
		dataMap.put("pageSum", pageSum);
		return dataMap;
	}
	@Resource
	private GradService gradService;
	@RequestMapping(value="/listGrads.do")
	public Map<String,Object> listGrad(Page page,HttpServletRequest request,HttpServletResponse response) throws Exception{
		Map<String,Object> dataMap =new HashMap<String,Object>();
		Map<String,Object> pageMap =new HashMap<String,Object>();
		int pageSum=-1;
		pageMap.put("pageSize", (page.getPageSize()<=0)?0:page.getPageSize());
		pageMap.put("pageNow", (page.getPageNow()<=0)?0:(page.getPageNow()-1)*page.getPageSize());
		if(pageSum==-1){
			pageSum=gradService.findRecords()/page.getPageSize()+1;
		}
		List<Grad> personList=new ArrayList<Grad>();
		personList=gradService.findGradByPage(pageMap);
		dataMap.put("person", personList);
		dataMap.put("pageSum", pageSum);
		return dataMap;
	}
	@Resource
	private  MemberService memberService;
	@RequestMapping(value="/listMembers.do")
	public Map<String,Object> listMember(Page page,HttpServletRequest request,HttpServletResponse response) throws Exception{
		Map<String,Object> dataMap =new HashMap<String,Object>();
		Map<String,Object> pageMap =new HashMap<String,Object>();
		int pageSum=-1;
		pageMap.put("pageSize", (page.getPageSize()<=0)?0:page.getPageSize());
		pageMap.put("pageNow", (page.getPageNow()<=0)?0:(page.getPageNow()-1)*page.getPageSize());
		if(pageSum==-1){
			pageSum=memberService.findRecords()/page.getPageSize()+1;
		}
		List<Member> personList=new ArrayList<Member>();
		personList=memberService.findMemberByPage(pageMap);
		dataMap.put("person", personList);
		dataMap.put("pageSum", pageSum);
		return dataMap;
	}
	
}
