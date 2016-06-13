package com.im.project.utils;

import java.util.HashMap;
import java.util.Map;

import com.im.project.model.ReturnStatus;

public class ResultUtils {
	public static Map<String,Object> toResultMap(Object obj){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		if(obj!=null){
			resultMap.put("data", obj);
			resultMap.put("msg", "查询成功");
			resultMap.put("status",  ReturnStatus.SUCCSS);
		}else{
			resultMap.put("data", null);
			resultMap.put("msg", "查询失败");
			resultMap.put("status",  ReturnStatus.ERROR);
		}
		return resultMap;
	}
}
