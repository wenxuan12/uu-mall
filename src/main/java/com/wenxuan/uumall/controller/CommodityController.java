package com.wenxuan.uumall.controller;

import com.wenxuan.uumall.request.CommodityDto;
import com.wenxuan.uumall.request.CommoditySimpleDto;
import com.wenxuan.uumall.result.Cors;
import com.wenxuan.uumall.result.Results;
import com.wenxuan.uumall.service.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "商品管理")
@RestController
@RequestMapping("/commodity")
public class CommodityController extends Cors {

    @Autowired
    CommodityService commodityService;

    @RequestMapping(
            value = "/search",
            method = RequestMethod.GET
    )
    @ApiOperation("返回商品列表")
    Results<List<CommoditySimpleDto>> search(@RequestParam(value = "manager", required = false) String manager,
                                             @RequestParam(value = "page",required = false) Integer page,
                                             @RequestParam(value = "per",required = false) Integer per){
        if(page== null || per != null) {
            page = 0;
            per = 20;
        }
        List<CommoditySimpleDto> dtos = commodityService.search(manager,page,per);
        return Results.success(dtos);
    }

    @RequestMapping(
            value = "/find/{id}",
            method = RequestMethod.GET
    )
    @ApiOperation("根据id查找商品详情")
    Results<CommodityDto> findOne(@PathVariable("id")Long id){
        CommodityDto dto = commodityService.findOne(id);
        return Results.success(dto);
    }

}
