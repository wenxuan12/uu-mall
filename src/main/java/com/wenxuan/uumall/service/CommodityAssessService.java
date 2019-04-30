package com.wenxuan.uumall.service;


import com.wenxuan.uumall.entity.CommodityAssess;
import com.wenxuan.uumall.mapper.CommodityAssessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityAssessService {
    @Autowired
    CommodityAssessMapper commodtiyAssessMapper;

    public List<CommodityAssess> findByCommodity(Long c_id){
        return commodtiyAssessMapper.findByCommodity(c_id);
    }

}
