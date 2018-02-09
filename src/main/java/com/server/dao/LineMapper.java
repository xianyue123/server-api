package com.server.dao;

import com.server.bean.Line;

public interface LineMapper {
    int deleteByPrimaryKey(Integer lineId);

    int insert(Line record);

    int insertSelective(Line record);

    Line selectByPrimaryKey(Integer lineId);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
}