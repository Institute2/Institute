
package com.im.project.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.project.manager.PictureMapper;
import com.im.project.model.Picture;
import com.im.project.service.PictureService;


@Service("pictureService")
public class PictureServiceImpl implements PictureService {
	
	@Resource
	private PictureMapper pictureDao;
	public boolean addPicture(Picture pic) {
		// TODO Auto-generated method stub
		boolean boo=false;
		if(pic!=null){
			pictureDao.insert(pic);
			boo=true;
		}
		return boo;
	}

	public Picture findPicture(Integer id) {
		// TODO Auto-generated method stub
		Picture pic=null;
		if(id>0&&id<Integer.MAX_VALUE){
			pic=pictureDao.selectByPrimaryKey(id);
		}
		return pic;
	}

	public boolean delPicture(Integer id) {
		// TODO Auto-generated method stub
		boolean boo=false;
		if(id>0&&id<Integer.MAX_VALUE){
			pictureDao.deleteByPrimaryKey(id);
			boo=true;
		}
		return boo;
	}

	public boolean modifyPicture(Picture pic) {
		// TODO Auto-generated method stub
		boolean boo=false;
		if(pic!=null){
			pictureDao.updateByPrimaryKey(pic);
			boo=true;
		}
		return boo;
	}

	public List<String> loadBigPic() {
		// TODO Auto-generated method stub
		List<String> picList=pictureDao.listPic();
		return picList;
	}

	public List<Picture> findPicByPage(Map<String, Object> picMap) {
		// TODO Auto-generated method stub
		List<Picture> picList =null;
		if(picMap!=null){
			picList=pictureDao.selectByType(picMap);
		}
		return picList;
	}
	
	public boolean addPicture1(Picture pic) {
		// TODO Auto-generated method stub
		boolean boo=false;
		if(pic!=null){
			pictureDao.insert(pic);
			boo=true;
		}
		return boo;
	}
}
