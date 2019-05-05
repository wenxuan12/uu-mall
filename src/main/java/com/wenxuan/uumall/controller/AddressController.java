package com.wenxuan.uumall.controller;


import com.wenxuan.uumall.entity.Address;
import com.wenxuan.uumall.result.Results;
import com.wenxuan.uumall.service.AddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(description = "用户地址管理")
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @ApiOperation("根据用户id查找地址")
    @RequestMapping(
            value = "/{u_id}",
            method = RequestMethod.GET
    )
    Results<List<Address>> find(@PathVariable("u_id") Long u_id){
        List<Address> addressList = addressService.find(u_id);
        return Results.success(addressList);
    }
}
