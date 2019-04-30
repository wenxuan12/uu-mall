package com.wenxuan.uumall.service;


import com.wenxuan.uumall.entity.CommodityManager;
import com.wenxuan.uumall.mapper.CommodityManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityManagerService {

    @Autowired
    CommodityManagerMapper commodityManagerMapper;

    public List<CommodityManager> findByCommodity(Long c_id){
        return commodityManagerMapper.findByCommodity(c_id);
    }
}
