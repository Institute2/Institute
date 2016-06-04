package com.im.project.manager;

import org.springframework.stereotype.Repository;

import com.im.project.model.Grad;
@Repository("gradDao")
public interface GradMapper extends BaseDao<Grad, Integer>{

}
