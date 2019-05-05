package com.wenxuan.uumall.service;


import com.wenxuan.uumall.mapper.ShopCarDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopCarDetailsService {

    @Autowired
    ShopCarDetailsMapper shopCarDetailsMapper;

}
