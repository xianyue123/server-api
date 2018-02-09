package com.server.dao;

import com.server.bean.UserBatch;

public interface UserBatchMapper {
    int insert(UserBatch record);

    int insertSelective(UserBatch record);
}