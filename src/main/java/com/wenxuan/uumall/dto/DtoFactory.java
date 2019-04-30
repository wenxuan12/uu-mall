package com.wenxuan.uumall.dto;

import com.wenxuan.uumall.entity.Commodity;
import com.wenxuan.uumall.request.CommodityDto;
import com.wenxuan.uumall.request.CommoditySimpleDto;

public class DtoFactory {

    public static CommodityDto commodityDto(Commodity entity){
        CommodityDto dto = new CommodityDto();
        dto.setId(entity.getId());
        dto.setBId(entity.getBId());
        dto.setName(entity.getName());
        dto.setPicUrl(entity.getPicUrl());
        dto.setClassOne(entity.getClassOne());
        dto.setClassTwo(entity.getClassTwo());
        dto.setClassThree(entity.getClassThree());
        dto.setOldPrice(entity.getOldPrice());
        dto.setPrice(entity.getPrice());
        dto.setStock(entity.getStock());
        dto.setWeight(entity.getWeight());
        dto.setConAssess(entity.getConAssess());
        dto.setAssessLv(entity.getAssessLv());
        dto.setAddTime(entity.getAddTime());
        dto.setUpdeTime(entity.getUpdeTime());
        dto.setJdUrl(entity.getJdUrl());
        dto.setStatus(entity.getStatus());
        return dto;
    }

    public static CommoditySimpleDto commoditySimpleDto(Commodity entity){
        CommoditySimpleDto dto = new CommoditySimpleDto();
        dto.setId(entity.getId());
        dto.setBId(entity.getBId());
        dto.setName(entity.getName());
        dto.setPicUrl(entity.getPicUrl());
        dto.setClassOne(entity.getClassOne());
        dto.setClassTwo(entity.getClassTwo());
        dto.setClassThree(entity.getClassThree());
        dto.setOldPrice(entity.getOldPrice());
        dto.setPrice(entity.getPrice());
        dto.setJdUrl(entity.getJdUrl());
        return dto;
    }

}
