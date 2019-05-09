package com.wenxuan.uumall.service;

import com.wenxuan.uumall.dto.DtoFactory;
import com.wenxuan.uumall.entity.Commodity;
import com.wenxuan.uumall.entity.CommodityManager;
import com.wenxuan.uumall.entity.ShopCar;
import com.wenxuan.uumall.entity.ShopCarDetails;
import com.wenxuan.uumall.mapper.CommodityMapper;
import com.wenxuan.uumall.mapper.ShopCarDetailsMapper;
import com.wenxuan.uumall.mapper.ShopCarMapper;
import com.wenxuan.uumall.request.ShopCarDetailsDto;
import com.wenxuan.uumall.request.ShopCarDetailsRequest;
import com.wenxuan.uumall.request.ShopCarDto;
import com.wenxuan.uumall.request.ShopCarRequest;
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

    public Results<List<ShopCarDto>> find(Long u_id,Long c_id){
        List<ShopCar> shopCars = shopCarMapper.find(u_id,c_id);
        List<ShopCarDto> dtos = shopCars.stream().map(shopCar -> {
            ShopCarDto dto = DtoFactory.shopCarDto(shopCar);
            List<ShopCarDetails> shopCarDetails = shopCarDetailsMapper.find(dto.getId());
            if (shopCarDetails!=null&&shopCarDetails.size()!=0){
                List<ShopCarDetailsDto> detailsDtos = shopCarDetails.stream().map(DtoFactory::shopCarDetailsDto).collect(Collectors.toList());
                dto.setListDetails(detailsDtos);
            }
            Commodity commodity = commodityMapper.findOne(dto.getCId());
            dto.setCommodity(DtoFactory.commodityDto(commodity));
            return dto;
        }).collect(Collectors.toList());
        return Results.success(dtos);
    }

    @Transactional
    public Results<ShopCarDto> add(ShopCarRequest request){
        ShopCar shopCar = shopCarMapper.add(request.getUId(),request.getCId());
        ShopCarDto dto = DtoFactory.shopCarDto(shopCar);
        List<ShopCarDetailsDto> detailsDtos = new ArrayList<>();
        List<ShopCarDetailsRequest> requests = request.getListDetails();
        for (ShopCarDetailsRequest shopCarDetailsRequest:requests){
            ShopCarDetails details = shopCarDetailsMapper.add(shopCar.getId(),shopCarDetailsRequest.getName(),shopCarDetailsRequest.getManager());
            detailsDtos.add(DtoFactory.shopCarDetailsDto(details));
        }
        dto.setListDetails(detailsDtos);
        return Results.success(dto);
    }

}
