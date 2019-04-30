package com.wenxuan.uumall.mapper;


import com.wenxuan.uumall.entity.Business;
import org.apache.ibatis.annotations.*;

@Mapper
public interface BusinessMapper {

    @Select("select * from business where user_name = #{user_name} and pass_word = #{pass_word}")
    Business checkLogin(@Param("user_name") String userName, @Param("pass_word") String passWord);

    @Insert("insert into business(user_name,pass_word,nick_name) value (#{user_name},#{pass_word},#{nick_name})")
    Integer addOne(@Param("user_name") String user_name, @Param("pass_word") String passWord, @Param("nick_name") String nicName);

    @Update("update business set pass_word  = #{pass_word} where user_name = #{user_name}")
    Integer changePwd(@Param("user_name") String userName, @Param("pass_word") String passWord);

    @Select("select * from business where id = #{id}")
    Business findOne(@Param("id") Long id);

    @Select("select * from business where user_name = #{user_name}")
    Business findBusiness(@Param("user_name") String userName);

    Integer updateBusiness(@Param("id") Long id, @Param("pass_word") String passWord, @Param("nick_name") String nicName, @Param("head_url") String headUrl,@Param("motto") String motto);

}
