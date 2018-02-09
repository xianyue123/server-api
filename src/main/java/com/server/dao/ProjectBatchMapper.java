package com.server.dao;

import com.server.bean.ProjectBatch;

public interface ProjectBatchMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectBatch record);

    int insertSelective(ProjectBatch record);

    ProjectBatch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectBatch record);

    int updateByPrimaryKey(ProjectBatch record);
}