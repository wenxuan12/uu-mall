package com.wenxuan.uumall.service;

import com.wenxuan.uumall.entity.CommodityDetails;
import com.wenxuan.uumall.mapper.CommodityDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityDetailsService {

    @Autowired
    CommodityDetailsMapper commodityDetailsMapper;

    public List<CommodityDetails> findByCommodity(Long c_id){
        return commodityDetailsMapper.findByCommodity(c_id);
    }
}
