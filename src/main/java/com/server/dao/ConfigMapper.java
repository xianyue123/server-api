package com.server.dao;

import com.server.bean.Config;

public interface ConfigMapper {
    int deleteByPrimaryKey(Integer cfgId);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Integer cfgId);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}