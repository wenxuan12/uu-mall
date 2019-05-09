package com.wenxuan.uumall.controller;


import com.wenxuan.uumall.entity.OrderList;
import com.wenxuan.uumall.result.Cors;
import com.wenxuan.uumall.result.Results;
import com.wenxuan.uumall.service.OrderListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "用户订单管理")
@RestController
@RequestMapping("/order")
public class OrderListController extends Cors {

    @Autowired
    OrderListService orderListService;

    @ApiOperation("返回订单列表")
    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET
    )
    Results<OrderList> find(@PathVariable("id") Long id){
        return null;
    }
}
