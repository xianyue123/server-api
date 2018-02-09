package com.server.dao;

import com.server.bean.Sys;

public interface SysMapper {
    int insert(Sys record);

    int insertSelective(Sys record);
}