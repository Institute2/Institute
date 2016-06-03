package com.im.project.manager;

import org.springframework.stereotype.Repository;

import com.im.project.model.Picture;
@Repository("pictureDao")
public interface PictureMapper  extends BaseDao<Picture, Integer>{

}
