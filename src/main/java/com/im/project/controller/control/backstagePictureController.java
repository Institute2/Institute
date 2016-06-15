package com.im.project.controller.control;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.im.project.model.Article;
import com.im.project.model.Picture;
import com.im.project.service.PictureService;

@Controller("backstagepicture")
@RequestMapping("/control/picture")
public class backstagePictureController {
	@Resource
	private PictureService pictureService;
	@RequestMapping("loadIndex")
	public ModelAndView loadIndex(){
		ModelAndView modelAndView = new ModelAndView();  
		return null;
		}
	@RequestMapping("modifyPicture")
	public ModelAndView modifyPicture(Picture p,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		ModelAndView modelAndView = new ModelAndView();  
		boolean boo=pictureService.modifyPicture(p);
		 if(boo){
	     modelAndView.addObject("msg", "success");  
		 }
		 else{
		modelAndView.addObject("msg", "failed");   
		 }
	     return modelAndView;   
		}
	public boolean addPicture(Picture p,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		boolean boo=pictureService.addPicture(p);
		if(boo){
			return true;
		}
		return false;
	}
}
