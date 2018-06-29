package com.myTest.service.impl;

import com.myTest.dao.UblUserMapper;
import com.myTest.model.UblUser;
import com.myTest.service.UblUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UblUserService")
public class UblUserServiceImpl implements UblUserService {

    @Resource
    private UblUserMapper ublUserMapper;

    public UblUser selectUser(int id) {
        return this.ublUserMapper.selectByPrimaryKey(id);
    }

}
