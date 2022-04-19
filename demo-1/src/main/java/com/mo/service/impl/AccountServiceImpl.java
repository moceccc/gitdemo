package com.mo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mo.pojo.Account;
import com.mo.service.AccountService;
import com.mo.mapper.AccountMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【account】的数据库操作Service实现
* @createDate 2022-04-19 09:16:27
*/
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService{

}




