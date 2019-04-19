package com.wenxuan.uumall.controller;

import com.wenxuan.uumall.Entity.Users;
import com.wenxuan.uumall.Result.Results;
import com.wenxuan.uumall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(
            value = "/chacklogin",
            method = RequestMethod.POST
    )
    Results ChackLogin(@RequestBody Users users){
        return userService.chackLogin(users.getUserName(),users.getPassWord());
    }

    @RequestMapping(
            value = "/test",
            method = RequestMethod.GET
    )
    String Test(){
        return "success";
    }
}
