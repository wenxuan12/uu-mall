package com.wenxuan.uumall.controller;


import com.wenxuan.uumall.entity.ShopCar;
import com.wenxuan.uumall.request.ShopCarDto;
import com.wenxuan.uumall.request.ShopCarRequest;
import com.wenxuan.uumall.result.Cors;
import com.wenxuan.uumall.result.Results;
import com.wenxuan.uumall.service.ShopCarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "购物车")
@RestController
@RequestMapping("/shop_car")
public class ShopCarController extends Cors {

    @Autowired
    ShopCarService shopCarService;

    @ApiOperation("查找用户购物车")
    @RequestMapping(
            value = "/find",
            method = RequestMethod.GET
    )
    Results<List<ShopCarDto>> find(@RequestParam(value = "u_id", required = false) Long uId,
                                   @RequestParam(value = "c_id", required = false) Long cId){
        return shopCarService.find(uId,cId);
    }

    @ApiOperation("添加购物车")
    @RequestMapping(
            value = "/add",
            method = RequestMethod.POST
    )
    Results<ShopCarDto> add(@RequestBody ShopCarRequest request){
        return shopCarService.add(request);
    }
}
