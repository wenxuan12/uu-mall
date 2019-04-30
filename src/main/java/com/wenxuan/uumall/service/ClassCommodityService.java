package com.wenxuan.uumall.service;


import com.wenxuan.uumall.entity.ClassCommodity;
import com.wenxuan.uumall.mapper.ClassCommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassCommodityService {

    @Autowired
    ClassCommodityMapper classCommodityMapper;

    public List<ClassCommodity> find(){
        return classCommodityMapper.find();
    }

}
