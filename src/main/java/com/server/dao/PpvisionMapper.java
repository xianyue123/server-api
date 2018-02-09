package com.server.dao;

import com.server.bean.Ppvision;

public interface PpvisionMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(Ppvision record);

    int insertSelective(Ppvision record);

    Ppvision selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(Ppvision record);

    int updateByPrimaryKey(Ppvision record);
}