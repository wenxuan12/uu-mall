package com.wenxuan.uumall.service;


import com.wenxuan.uumall.entity.Commodity;
import com.wenxuan.uumall.mapper.CommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService {

    @Autowired
    CommodityMapper commodityMapper;

    public List<Commodity> find(String manager,Integer page,Integer per){
        if(page== null || per != null) {
            page = 1;
            per = 20;
        }
        return commodityMapper.find(manager,page,per);
    }
}
