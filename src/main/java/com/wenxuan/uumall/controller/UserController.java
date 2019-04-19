package com.wenxuan.uumall.controller;

import com.wenxuan.uumall.Entity.Users;
import com.wenxuan.uumall.Result.Results;
import com.wenxuan.uumall.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Api(description = "用户管理")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("用户登录")
    @RequestMapping(
            value = "/chacklogin",
            method = RequestMethod.POST
    )
    Results<Users> ChackLogin(@RequestBody Users users){
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
