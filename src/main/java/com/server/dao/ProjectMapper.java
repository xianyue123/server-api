package com.server.dao;

import com.server.bean.Project;

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer projId);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer projId);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}