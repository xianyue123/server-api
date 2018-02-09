package com.server.dao;

import com.server.bean.Layer;

public interface LayerMapper {
    int deleteByPrimaryKey(Integer layerId);

    int insert(Layer record);

    int insertSelective(Layer record);

    Layer selectByPrimaryKey(Integer layerId);

    int updateByPrimaryKeySelective(Layer record);

    int updateByPrimaryKey(Layer record);
}