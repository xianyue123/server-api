package com.server.dao;

import com.server.bean.Equip;

public interface EquipMapper {
    int deleteByPrimaryKey(Integer equipId);

    int insert(Equip record);

    int insertSelective(Equip record);

    Equip selectByPrimaryKey(Integer equipId);

    int updateByPrimaryKeySelective(Equip record);

    int updateByPrimaryKey(Equip record);
}