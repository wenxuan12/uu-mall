package com.wenxuan.uumall.service;


import com.wenxuan.uumall.mapper.OrderListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderListService {

    @Autowired
    OrderListMapper orderListMapper;


}
