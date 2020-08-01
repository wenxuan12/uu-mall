package com.wenxuan.uumall.service;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.wenxuan.uumall.entity.Users;
import com.wenxuan.uumall.mapper.UserMapper;
import com.wenxuan.uumall.request.UserRequest;
import com.wenxuan.uumall.request.CheckLoginRequest;
import com.wenxuan.uumall.result.Results;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService  {

    @Autowired
    private UserMapper userMapper;

    public Results<Users> chackLogin(CheckLoginRequest request){
        if (StringUtils.isNotEmpty(request.getUserName())&&StringUtils.isNotEmpty(request.getPassWord())){
            Users users = userMapper.checkLogin(request.getUserName(),request.getPassWord());
            if (null == users){
                return Results.error("账号或密码错误");
            }
            return Results.success(users);
        }
        return Results.error("账号密码不能为空");
    }

    public Results<CheckLoginRequest> mobileCode(CheckLoginRequest mobileCheckRequest){
        if (mobileCheckRequest.getUserName().length() != 11){
            return Results.error("手机号长度不正确");
        }
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "11LTAIRLb6GBCCtKk822", "11ErfuyvEkMRMUsmumOgHkL6WPvYlqal22");
        IAcsClient client = new DefaultAcsClient(profile);
        int number = (int)(Math.random()*864198+123456);
        CommonRequest request = new CommonRequest();
        //request.setProtocol(ProtocolType.HTTPS);
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", mobileCheckRequest.getUserName());
        request.putQueryParameter("SignName", "UU商城");
        request.putQueryParameter("TemplateCode", "SMS_163847219");
        request.putQueryParameter("TemplateParam", "{\"code\":\"" + number + "\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            JSONObject jsStr = JSONObject.parseObject(response.getData());
            String str = jsStr.getString("Message");
            if (!str.equals("OK")){
                return Results.error(str);
            }
            mobileCheckRequest.setCheckingCode(String.valueOf(number));
            return Results.success(mobileCheckRequest);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return Results.error("短信发送失败");
    }

    @Transactional
    public Results<Users> register(UserRequest request){
        Users users = userMapper.findUsers(request.getUserName());
        if (null != users) {
            return Results.error("手机号已注册");
        }
        Integer integer = userMapper.addOne(request.getUserName(),request.getPassWord(),request.getNickName());
        if (integer == 1){
            return Results.success();
        }
        return Results.error("更新失败");
    }

    @Transactional
    public Results changePwd(Integer id, CheckLoginRequest request){
        if (null == id){
            return Results.error("id为空");
        }
        Users users =  userMapper.findOne(id);
        if (null == users){
            return Results.error("用户不存在");
        }
        Integer integer = userMapper.changePwd(request.getUserName(),request.getPassWord());
        if (integer == 1){
            return Results.success();
        }
        return Results.error("更新失败");
    }

    @Transactional
    public Results updateUser(Integer id, UserRequest request){
        if (null == id){
            return Results.error("id为空");
        }
        Users users =  userMapper.findOne(id);
        if (null == users){
            return Results.error("用户不存在");
        }
        Integer integer = userMapper.updateUser(id,request.getPassWord(),request.getNickName(),request.getSex(),request.getHeadUrl(),request.getMotto());
        if (integer == 1){
            return Results.success();
        }
        return Results.error("更新失败");
    }

    public Results<Users> findOne(Integer id){
        Users users = userMapper.findOne(id);
        if (null != users) {
            return Results.success(users);
        }
        return Results.error("此用户不存在");
    }

}
