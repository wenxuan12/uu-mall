package com.wenxuan.uumall.service;

import com.wenxuan.uumall.dto.DtoFactory;
import com.wenxuan.uumall.entity.*;
import com.wenxuan.uumall.mapper.CommodityMapper;
import com.wenxuan.uumall.mapper.ShopCarDetailsMapper;
import com.wenxuan.uumall.mapper.ShopCarMapper;
import com.wenxuan.uumall.request.*;
import com.wenxuan.uumall.result.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShopCarService {

    @Autowired
    ShopCarMapper shopCarMapper;
    @Autowired
    ShopCarDetailsMapper shopCarDetailsMapper;
    @Autowired
    CommodityMapper commodityMapper;
    @Autowired
    BusinessService businessService;
    public Results<List<ShopCarDto>> find(Long user_id){
        List<ShopCar> shopCars = shopCarMapper.find(user_id);
        List<ShopCarDto> dtos = shopCars.stream().map(shopCar -> {
            ShopCarDto dto = DtoFactory.shopCarDto(shopCar);
//            List<ShopCarDetails> shopCarDetails = shopCarDetailsMapper.find(dto.getId());
//            if (shopCarDetails!=null&&shopCarDetails.size()!=0){
//                List<ShopCarDetailsDto> detailsDtos = shopCarDetails.stream().map(DtoFactory::shopCarDetailsDto).collect(Collectors.toList());
//                dto.setListDetails(detailsDtos);
//            }
            Commodity commodity = commodityMapper.findOne(dto.getCommodityId());
            CommoditySimpleDto commoditySimpleDto = DtoFactory.commoditySimpleDto(commodity);
            Business business = businessService.findOne(commoditySimpleDto.getBusinessId()).getData();
            if (business != null) {
                commoditySimpleDto.setBusinessName(business.getNickName());
            }
            dto.setCommodity(commoditySimpleDto);
            return dto;
        }).collect(Collectors.toList());
        return Results.success(dtos);
    }

    @Transactional
    public Results<Boolean> add(ShopCarRequest request){
        ShopCar shopCar = shopCarMapper.findByUserIdAndCommodityId(request.getUserId(),request.getCommodityId());
        if (shopCar!=null){
            shopCar.setNumber(shopCar.getNumber() + request.getNumber());
            Integer in = shopCarMapper.update(shopCar.getNumber(),shopCar.getId());
            if (in==1){
                return Results.success();
            }
            return Results.error();
        }
        Integer integer = shopCarMapper.add(request.getUserId(),request.getCommodityId(),request.getNumber());
        if (integer == 1){
            return Results.success();
        }
        return Results.error();
//        List<ShopCarDetailsDto> detailsDtos = new ArrayList<>();
//        List<ShopCarDetailsRequest> requests = request.getListDetails();
//        for (ShopCarDetailsRequest shopCarDetailsRequest:requests){
//            ShopCarDetails details = shopCarDetailsMapper.add(shopCar.getId(),shopCarDetailsRequest.getName(),shopCarDetailsRequest.getManager());
//            detailsDtos.add(DtoFactory.shopCarDetailsDto(details));
//        }
//        dto.setListDetails(detailsDtos);
    }

}
