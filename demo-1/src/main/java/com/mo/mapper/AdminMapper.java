package com.mo.mapper;

import com.mo.pojo.Admin;

public interface AdminMapper {
    int insert(Admin record);

    int insertSelective(Admin record);
}