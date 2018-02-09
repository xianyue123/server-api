package com.server.dao;

import com.server.bean.Panoramas;

public interface PanoramasMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Panoramas record);

    int insertSelective(Panoramas record);

    Panoramas selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Panoramas record);

    int updateByPrimaryKey(Panoramas record);
}