package com.server.dao;

import com.server.bean.Placemark;

public interface PlacemarkMapper {
    int deleteByPrimaryKey(Integer pmId);

    int insert(Placemark record);

    int insertSelective(Placemark record);

    Placemark selectByPrimaryKey(Integer pmId);

    int updateByPrimaryKeySelective(Placemark record);

    int updateByPrimaryKey(Placemark record);
}