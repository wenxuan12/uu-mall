package com.wenxuan.uumall.service;


import com.wenxuan.uumall.entity.Address;
import com.wenxuan.uumall.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressMapper addressMapper;

    public List<Address> find(Long u_id){
        return addressMapper.find(u_id);
    }

}
