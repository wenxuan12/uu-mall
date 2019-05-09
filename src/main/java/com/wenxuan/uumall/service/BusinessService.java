package com.wenxuan.uumall.service;


import com.wenxuan.uumall.entity.Business;
import com.wenxuan.uumall.mapper.BusinessMapper;
import com.wenxuan.uumall.request.BusinessRequest;
import com.wenxuan.uumall.request.CheckLoginRequest;
import com.wenxuan.uumall.result.Results;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BusinessService {

    @Autowired
    private BusinessMapper businessMapper;


    public Results<Business> chackLogin(CheckLoginRequest request){
        if (StringUtils.isNotEmpty(request.getUserName())&&StringUtils.isNotEmpty(request.getPassWord())){
            Business business = businessMapper.checkLogin(request.getUserName(),request.getPassWord());
            if (null == business){
                return Results.error("账号或密码错误");
            }
            return Results.success(business);
        }
        return Results.error("账号密码不能为空");
    }

    @Transactional
    public Results<Business> register(BusinessRequest request){
        Business business = businessMapper.findBusiness(request.getUserName());
        if (null != business) {
            return Results.error("手机号已注册");
        }
        Integer integer = businessMapper.addOne(request.getUserName(),request.getPassWord(),request.getNickName());
        if (integer == 1){
            return Results.success();
        }
        return Results.error("更新失败");
    }

    @Transactional
    public Results changePwd(Long id, CheckLoginRequest request){
        if (null == id){
            return Results.error("id为空");
        }
        Business business =  businessMapper.findOne(id);
        if (null == business){
            return Results.error("用户不存在");
        }
        Integer integer = businessMapper.changePwd(request.getUserName(),request.getPassWord());
        if (integer == 1){
            return Results.success();
        }
        return Results.error("更新失败");
    }

    @Transactional
    public Results updateUser(Long id, BusinessRequest request){
        if (null == id){
            return Results.error("id为空");
        }
        Business business =  businessMapper.findOne(id);
        if (null == business){
            return Results.error("用户不存在");
        }
        Integer integer = businessMapper.updateBusiness(id,request.getPassWord(),request.getNickName(),request.getHeadUrl(),request.getMotto());
        if (integer == 1){
            return Results.success();
        }
        return Results.error("更新失败");
    }

    public Results<Business> findOne(Long id){
        Business business = businessMapper.findOne(id);
        if (null != business) {
            return Results.success(business);
        }
        return Results.error("此用户不存在");
    }
}
