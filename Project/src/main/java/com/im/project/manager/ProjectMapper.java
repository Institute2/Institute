package com.im.project.manager;

import org.springframework.stereotype.Repository;

import com.im.project.model.Project;
@Repository("projectDao")
public interface ProjectMapper extends BaseDao<Project, Integer>{

}
