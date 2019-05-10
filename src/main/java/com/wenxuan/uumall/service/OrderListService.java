package com.wenxuan.uumall.service;


import com.wenxuan.uumall.entity.OrderList;
import com.wenxuan.uumall.entity.ShopCar;
import com.wenxuan.uumall.mapper.OrderListMapper;
import com.wenxuan.uumall.mapper.ShopCarMapper;
import com.wenxuan.uumall.request.OrderListRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderListService {

    @Autowired
    OrderListMapper orderListMapper;
    @Autowired
    ShopCarMapper shopCarMapper;

    public List<OrderList> find(Long user_id){
        return orderListMapper.find(user_id);
    }

    @Transactional
    public Boolean add(OrderListRequest request){
        Integer integer = orderListMapper.add(request.getUserId(),request.getAddressId(),request.getCommodityId(), LocalDateTime.now());
        if (integer==1){
            ShopCar shopCar = shopCarMapper.findOne(request.getShopCarId());
            if (shopCar!= null){
                Integer in = shopCarMapper.delete(request.getShopCarId());
                if (in == 1){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
