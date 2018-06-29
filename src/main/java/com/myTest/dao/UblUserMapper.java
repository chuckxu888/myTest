package com.myTest.dao;

import com.myTest.model.UblUser;

public interface UblUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UblUser record);

    int insertSelective(UblUser record);

    UblUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UblUser record);

    int updateByPrimaryKey(UblUser record);
}