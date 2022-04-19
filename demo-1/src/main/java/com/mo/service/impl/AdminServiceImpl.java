package com.mo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mo.pojo.Admin;
import com.mo.service.AdminService;
import com.mo.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【admin】的数据库操作Service实现
* @createDate 2022-04-19 09:16:27
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}




