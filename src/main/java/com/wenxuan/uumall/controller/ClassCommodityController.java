package com.wenxuan.uumall.controller;

import com.wenxuan.uumall.entity.ClassCommodity;
import com.wenxuan.uumall.result.Cors;
import com.wenxuan.uumall.service.ClassCommodityService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = "商家分类管理")
@RequestMapping("/class_commmodity")
public class ClassCommodityController extends Cors {

    @Autowired
    ClassCommodityService classCommodityService;

    @RequestMapping(
            value = "/find",
            method = RequestMethod.GET
    )
    public List<ClassCommodity> find(){
        return classCommodityService.find();
    }

}
