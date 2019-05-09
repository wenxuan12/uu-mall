package com.wenxuan.uumall.dto;

import com.wenxuan.uumall.entity.Address;
import com.wenxuan.uumall.entity.Commodity;
import com.wenxuan.uumall.entity.ShopCar;
import com.wenxuan.uumall.entity.ShopCarDetails;
import com.wenxuan.uumall.request.*;

public class DtoFactory {

    public static AddressDto addressDto(Address entity){
        AddressDto addressDto = new AddressDto();
        addressDto.setId(entity.getId());
        addressDto.setReceiveMan(entity.getReceiveMan());
        addressDto.setAddressClear(entity.getAddressClear());
        addressDto.setPhone(entity.getPhone());
        addressDto.setUId(entity.getUId());
        addressDto.setStatus(entity.getStatus());
        return addressDto;
    }

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

    public static ShopCarDto shopCarDto(ShopCar entity){
        ShopCarDto shopCarDto = new ShopCarDto();
        shopCarDto.setId(entity.getId());
        shopCarDto.setCId(entity.getCId());
        shopCarDto.setUId(entity.getUId());
        return shopCarDto;
    }

    public static ShopCarDetailsDto shopCarDetailsDto(ShopCarDetails entity){
        ShopCarDetailsDto dto = new ShopCarDetailsDto();
        dto.setName(entity.getName());
        dto.setManager(entity.getManager());
        return dto;
    }

}
