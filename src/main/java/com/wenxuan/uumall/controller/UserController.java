package com.wenxuan.uumall.controller;

import com.wenxuan.uumall.Entity.Users;
import com.wenxuan.uumall.Request.UserRequest;
import com.wenxuan.uumall.Request.chackLgionRequest;
import com.wenxuan.uumall.Result.Results;
import com.wenxuan.uumall.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    Results<Users> ChackLogin(@RequestBody chackLgionRequest request){
        return userService.chackLogin(request.getUserName(),request.getPassWord());
    }

//    @RequestMapping(
//            value = "/register",
//            method = RequestMethod.POST
//    )
//    Results<Users> register(@RequestBody chackLgionRequest request){
//        return userService.register(request.getUserName());
//    }

    @RequestMapping(
            value = "/usere/{id}",
            method = RequestMethod.GET
    )
    Results<Users> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequest request){
        return userService.updateUser(id,request);
    }
        @RequestMapping(
            value = "/register",
            method = RequestMethod.GET
    )
    String register(){
            return userService.register(null);
        }
}
