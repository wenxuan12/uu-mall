package com.wenxuan.uumall.controller;


import com.wenxuan.uumall.dto.DtoFactory;
import com.wenxuan.uumall.entity.Address;
import com.wenxuan.uumall.request.AddressDto;
import com.wenxuan.uumall.request.AddressRequest;
import com.wenxuan.uumall.result.Cors;
import com.wenxuan.uumall.result.Results;
import com.wenxuan.uumall.service.AddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@Api(description = "用户地址管理")
@RestController
@RequestMapping("/address")
public class AddressController extends Cors {

    @Autowired
    AddressService addressService;

    @ApiOperation("根据用户id查找地址")
    @RequestMapping(
            value = "/{u_id}",
            method = RequestMethod.GET
    )
    Results<List<AddressDto>> find(@PathVariable("u_id") Long u_id){
        List<Address> addressList = addressService.find(u_id);
        List<AddressDto> dtos = addressList.stream().map(DtoFactory::addressDto).collect(Collectors.toList());
        return Results.success(dtos);
    }

    @ApiOperation("添加用户地址")
    @RequestMapping(
            value = "/",
            method = RequestMethod.POST
    )
    Results<AddressDto> add(@RequestBody AddressRequest request){
        Address address = addressService.add(request);
        AddressDto dto = DtoFactory.addressDto(address);
        return Results.success(dto);
    }
}
