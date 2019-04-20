package com.wenxuan.uumall.controller;

import com.wenxuan.uumall.entity.Users;
import com.wenxuan.uumall.request.UserRequest;
import com.wenxuan.uumall.request.CheckLgionRequest;
import com.wenxuan.uumall.result.Results;
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
            value = "/checklogin",
            method = RequestMethod.POST
    )
    Results<Users> CheckLogin(@RequestBody CheckLgionRequest request){
        return userService.chackLogin(request.getUserName(),request.getPassWord());
    }

    @ApiOperation("手机验证码")
    @RequestMapping(
            value = "/mobile",
            method = RequestMethod.POST
    )
    Results<CheckLgionRequest> mobileCode(@RequestBody CheckLgionRequest request){
        return userService.mobileCode(request);
    }

    @ApiOperation("用户注册")
    @RequestMapping(
            value = "/register",
            method = RequestMethod.POST
    )
    Results<Users> register(@RequestBody UserRequest request){
        return userService.register(request);
    }

    @ApiOperation("修改找回用户密码")
    @RequestMapping(
            value = "/changepwd/{id}",
            method = RequestMethod.POST
    )
    Results changePwd(@PathVariable("id") Integer id, @RequestBody CheckLgionRequest request){
        return userService.changePwd(id,request);
    }

    @ApiOperation("修改用户信息")
    @RequestMapping(
            value = "/user/{id}",
            method = RequestMethod.PUT
    )
    Results updateUser(@PathVariable("id") Integer id, @RequestBody UserRequest request){
        return userService.updateUser(id,request);
    }

    @ApiOperation("根据id查找用户")
    @RequestMapping(
            value = "/user/{id}",
            method = RequestMethod.GET
    )
    Results<Users> findOne(@PathVariable("id") Integer id){
        return userService.findOne(id);
    }
}
