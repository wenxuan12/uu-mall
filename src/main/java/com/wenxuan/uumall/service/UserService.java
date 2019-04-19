package com.wenxuan.uumall.service;


import com.wenxuan.uumall.Entity.Users;
import com.wenxuan.uumall.Mapper.UserMapper;
import com.wenxuan.uumall.Result.Results;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    @Autowired
    private UserMapper userMapper;

    public Results<Users>  chackLogin(String userName, String passWord){
        if (StringUtils.isNotEmpty(userName)&&StringUtils.isNotEmpty(passWord)){
            Users users = userMapper.checkLogin(userName,passWord);
            if (null == users){
                return Results.error("账号或密码错误");
            }
            return Results.success(users);
        }
        return Results.error("账号密码不能为空");
    }

}
