package com.wenxuan.uumall.controller;


import com.wenxuan.uumall.result.Cors;
import com.wenxuan.uumall.service.WalkBillService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "用户账单管理")
@RestController
@RequestMapping("/walk")
public class WalkBillController extends Cors {

    @Autowired
    WalkBillService walkBillService;



}
