package com.mo.service.impl;

import com.mo.mapper.UserMapper;
import com.mo.pojo.User;
import com.mo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * **********
 * 15:59
 * Administrator
 * **********
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryById(Integer id) {

        User select = userMapper.selectByPrimaryKey(id);
        return select;
    }
}
