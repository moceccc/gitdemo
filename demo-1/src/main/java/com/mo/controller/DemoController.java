package com.mo.controller;


import com.mo.mapper.UserMapper;
import com.mo.pojo.User;
import com.mo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;


/**
 * **********
 * 14:02
 * Administrator
 * **********
 */
@Controller
public class DemoController {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;

   // @ResponseBody
    @GetMapping("/demo1")
    public String demo1(HttpServletResponse httpServletRequest){

        return "index";

    }
    @GetMapping("/getGoodsList")
    @ResponseBody
    public String getGoodsList(){
        return "清单";
    }
    @GetMapping("/demo3")
    @ResponseBody
    public User dem3(@RequestParam Integer id){
        return userService.queryById(id);
    }
}
