package com.mo.service;

import com.mo.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Service
* @createDate 2022-04-19 09:16:27
*/
public interface UserService extends IService<User> {
    User queryById(Integer id);

}
