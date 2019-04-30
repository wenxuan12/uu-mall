package com.wenxuan.uumall.controller;

import com.wenxuan.uumall.request.CommodityDto;
import com.wenxuan.uumall.result.Results;
import com.wenxuan.uumall.service.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(description = "商品管理")
@RestController
@RequestMapping("/commodity")
public class CommodityController {

    @Autowired
    CommodityService commodityService;


    @RequestMapping(
            value = "/find",
            method = RequestMethod.GET
    )
    @ApiOperation("返回商品列表")
    Results<List<CommodityDto>> search(@RequestParam(value = "manager", required = false) String manager,
                                    @RequestParam(value = "page",required = false) Integer page,
                                    @RequestParam(value = "per",required = false) Integer per){
        if(page== null || per != null) {
            page = 0;
            per = 20;
        }
        List<CommodityDto> dtos = commodityService.search(manager,page,per);
        return Results.success(dtos);
    }

}
