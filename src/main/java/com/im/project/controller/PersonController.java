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
	private  MemberService memberService;
	
	
	@Resource
	private LeaderService leaderService;
	
	@Resource
	private GradService gradService;
	@RequestMapping("listPerson.do")
	public Map<String,Object>  listPerson(Page page,int type ,HttpServletRequest request,HttpServletResponse response) throws Exception{

		Map<String,Object> dataMap =new HashMap<String,Object>();
		Map<String,Object> pageMap =new HashMap<String,Object>();
		pageMap.put("pageNow", page.getPageNow());
		pageMap.put("pageSize", page.getPageSize());
		int pageSum=-1;
		if(type==1){
			if(pageSum==-1){
				pageSum=leaderService.findrecords()/page.getPageSize()+1;
			}
			List<Leader> personList=new ArrayList<Leader>();
			personList = leaderService.findLeaderByPage(pageMap);
			dataMap.put("personlist", personList);
			dataMap.put("pageSum", pageSum);
			 
		}else if(type==2){
			if(pageSum==-1){
				pageSum=leaderService.findrecords()/page.getPageSize()+1;
			}
			List<Member> personList=new ArrayList<Member>();
			personList = memberService.findMemberByPage(pageMap);
			dataMap.put("personlist", personList);
			dataMap.put("pageSum", pageSum);
		}else if(type==3){
			if(pageSum==-1){
				pageSum=leaderService.findrecords()/page.getPageSize()+1;
			}
			List<Grad> personList=new ArrayList<Grad>();
			personList = gradService.findGradByPage(pageMap);
			dataMap.put("personlist", personList);
			dataMap.put("pageSum", pageSum);
		}
		return dataMap;
	}
	
	
}
