package com.wenxuan.uumall.mapper;

import com.wenxuan.uumall.entity.Users;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from Users where user_name = #{user_name} and pass_word = #{pass_word}")
    Users checkLogin(@Param("user_name") String userName, @Param("pass_word") String passWord);

    @Insert("insert into Users(user_name,pass_word,nick_name) value (#{user_name},#{pass_word},#{nick_name})")
    Integer insertOne(@Param("user_name") String user_name, @Param("pass_word") String passWord, @Param("nick_name") String nicName);

    @Update("update Users set pass_word  = #{pass_word} where user_name = #{user_name}")
    Integer changePwd(@Param("user_name") String userName, @Param("pass_word") String passWord);

    @Select("select * from Users where id = #{id}")
    Users findOne(@Param("id") Integer id);

    @Select("select * from Users where user_name = #{user_name}")
    Users findUsers(@Param("user_name") String userName);

    Integer updateUser(@Param("id") Integer id, @Param("pass_word") String passWord, @Param("nick_name") String nicName,@Param("sex") Integer sex, @Param("head_url") String headUrl,@Param("motto") String motto);
}
