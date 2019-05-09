package com.wenxuan.uumall.controller;


import com.wenxuan.uumall.result.Cors;
import com.wenxuan.uumall.result.Results;
import com.wenxuan.uumall.service.WalkBillService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(description = "用户账单管理")
@RestController
@RequestMapping("/walk")
public class WalkBillController extends Cors {

    @Autowired
    WalkBillService walkBillService;

    @ApiOperation("查看钱包")
    @RequestMapping(
            value = "/",
            method = RequestMethod.GET
    )
    Results find(){
        return Results.success();
    }

    @ApiOperation("查看账单")
    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET
    )
    Results bill(@PathVariable("id") Long id){
        return Results.success();
    }


    @ApiOperation("添加账单")
    @RequestMapping(
            value = "/",
            method = RequestMethod.POST
    )
    Results add(@RequestBody Long id){
        return Results.success();
    }

    @ApiOperation("删除账单")
    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.DELETE
    )
    Results delete(@PathVariable("id")Long id){
        return Results.success();
    }

}
