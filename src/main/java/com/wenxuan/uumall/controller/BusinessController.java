package com.wenxuan.uumall.controller;


import com.wenxuan.uumall.entity.Business;
import com.wenxuan.uumall.request.BusinessRequest;
import com.wenxuan.uumall.request.CheckLgionRequest;
import com.wenxuan.uumall.result.Results;
import com.wenxuan.uumall.service.BusinessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(description = "商家后台管理")
@RestController
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    BusinessService businessService;

    @ApiOperation("商家登录")
    @RequestMapping(
            value = "/checklogin",
            method = RequestMethod.POST
    )
    Results<Business> checklogin(@RequestBody CheckLgionRequest request){
        return businessService.chackLogin(request);
    }

    @ApiOperation("用户注册")
    @RequestMapping(
            value = "/register",
            method = RequestMethod.POST
    )
    Results<Business> register(@RequestBody BusinessRequest request){
        return businessService.register(request);
    }

    @ApiOperation("修改找回用户密码")
    @RequestMapping(
            value = "/changepwd/{id}",
            method = RequestMethod.POST
    )
    Results changePwd(@PathVariable("id") Integer id, @RequestBody CheckLgionRequest request){
        return businessService.changePwd(id,request);
    }

    @ApiOperation("修改用户信息")
    @RequestMapping(
            value = "/user/{id}",
            method = RequestMethod.PUT
    )
    Results updateUser(@PathVariable("id") Integer id, @RequestBody BusinessRequest request){
        return businessService.updateUser(id,request);
    }

    @ApiOperation("根据id查找用户")
    @RequestMapping(
            value = "/user/{id}",
            method = RequestMethod.GET
    )
    Results<Business> findOne(@PathVariable("id") Integer id){
        return businessService.findOne(id);
    }
}
