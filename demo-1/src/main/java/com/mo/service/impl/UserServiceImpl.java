package com.mo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mo.pojo.User;
import com.mo.service.UserService;
import com.mo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-04-19 09:16:27
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryById(Integer id) {
        User user = userMapper.selectById(id);
        return user;
    }
}




