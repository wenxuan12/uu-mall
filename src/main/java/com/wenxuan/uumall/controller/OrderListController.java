package com.wenxuan.uumall.controller;


import com.wenxuan.uumall.entity.OrderList;
import com.wenxuan.uumall.request.OrderListRequest;
import com.wenxuan.uumall.result.Cors;
import com.wenxuan.uumall.result.Results;
import com.wenxuan.uumall.service.OrderListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "用户订单管理")
@RestController
@RequestMapping("/order")
public class OrderListController extends Cors {

    @Autowired
    OrderListService orderListService;

    @ApiOperation("根据用户id返回订单列表")
    @RequestMapping(
            value = "/{user_id}",
            method = RequestMethod.GET
    )
    Results<List<OrderList>> find(@PathVariable("user_id") Long user_id){
        List<OrderList> lists = orderListService.find(user_id);
        return Results.success(lists);
    }
    @ApiOperation("添加订单列表")
    @RequestMapping(
            value = "/add",
            method = RequestMethod.POST
    )
    Results add(@RequestBody OrderListRequest request){
        if (orderListService.add(request)){
            return Results.success();
        }
        return Results.error();
    }
}
