package com.wenxuan.uumall.service;


import com.wenxuan.uumall.mapper.ShopCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopCarService {

    @Autowired
    ShopCarMapper shopCarMapper;

}
