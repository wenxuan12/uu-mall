package com.wenxuan.uumall.service;


import com.wenxuan.uumall.entity.Address;
import com.wenxuan.uumall.mapper.AddressMapper;
import com.wenxuan.uumall.request.AddressRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressMapper addressMapper;

    public List<Address> find(Long user_id){
        return addressMapper.find(user_id);
    }

    public Boolean add(AddressRequest request){
        Integer integer = addressMapper.add(request.getUserId(),request.getReceiveMan(),request.getAddressClear(),request.getPhone());
        if (integer == 1){
            return true;
        }
        return false;
    }
}
