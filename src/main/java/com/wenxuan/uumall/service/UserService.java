package com.wenxuan.uumall.service;


import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.wenxuan.uumall.Entity.Users;
import com.wenxuan.uumall.Mapper.UserMapper;
import com.wenxuan.uumall.Request.UserRequest;
import com.wenxuan.uumall.Result.Results;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

@Service
public class UserService  {

    @Autowired
    private UserMapper userMapper;

    public Results<Users> chackLogin(String userName, String passWord){
        if (StringUtils.isNotEmpty(userName)&&StringUtils.isNotEmpty(passWord)){
            Users users = userMapper.checkLogin(userName,passWord);
            if (null == users){
                return Results.error("账号或密码错误");
            }
            return Results.success(users);
        }
        return Results.error("账号密码不能为空");
    }

    public String register(String userName){
//        if (userName.length() != 11){
//            return Results.error("手机号长度不正确");
//        }
        String str = "qwe";
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIRLb6GBCCtKk8", "ErfuyvEkMRMUsmumOgHkL6WPvYlqal");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        //request.setProtocol(ProtocolType.HTTPS);
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendBatchSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumberJson", "15869176325");
        request.putQueryParameter("SignNameJson", "随手快递");
        request.putQueryParameter("TemplateCode", "SMS_137525162");

        request.putQueryParameter("TemplateParamJson", "{\"code\":\"123\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            str = response.getData();
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return str;
    }


    public Results<Users> updateUser(Integer id, UserRequest request){
        if (null == id){
            return Results.error("id为空");
        }
        Users users =  userMapper.findOne(id);
        if (null == users){
            return Results.error("用户不存在");
        }
        users = userMapper.updateUser(id,request.getUserName(),request.getPassWord(),request.getNickName());
        return Results.success(users);
    }
}
