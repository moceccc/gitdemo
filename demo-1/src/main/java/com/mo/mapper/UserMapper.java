package com.mo.mapper;
import java.io.Serializable;
import java.util.List;

import com.mo.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-04-19 09:16:27
* @Entity com.mo.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {

    @Override
    User selectById(Serializable id);
}




