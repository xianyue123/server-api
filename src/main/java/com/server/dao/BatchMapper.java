package com.server.dao;

import com.server.bean.Batch;

public interface BatchMapper {
    int deleteByPrimaryKey(Integer batchId);

    int insert(Batch record);

    int insertSelective(Batch record);

    Batch selectByPrimaryKey(Integer batchId);

    int updateByPrimaryKeySelective(Batch record);

    int updateByPrimaryKey(Batch record);
}