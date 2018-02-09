package com.server.dao;

import com.server.bean.UserProject;

public interface UserProjectMapper {
    int deleteByPrimaryKey(Integer upId);

    int insert(UserProject record);

    int insertSelective(UserProject record);

    UserProject selectByPrimaryKey(Integer upId);

    int updateByPrimaryKeySelective(UserProject record);

    int updateByPrimaryKey(UserProject record);
}