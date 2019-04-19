package com.wenxuan.uumall.Mapper;

import com.wenxuan.uumall.Entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from Users where user_name = #{user_name} and pass_word = #{pass_word}")
    Users checkLogin(@Param("user_name") String userName, @Param("pass_word") String passWord);
}
