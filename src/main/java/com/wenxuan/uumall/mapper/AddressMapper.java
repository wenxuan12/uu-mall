package com.wenxuan.uumall.mapper;


import com.wenxuan.uumall.entity.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AddressMapper {

    @Select("select * from address where user_id = #{user_id}")
    List<Address> find(@Param("user_id")Long user_id);

    @Select("select * from address where id = #{id}")
    Address findOne(@Param("id") Long id);

    @Insert("insert into address(user_id,receive_man,address_clear,phone) value (#{user_id},#{receive_man},#{address_clear},#{phone})")
    Integer add(@Param("user_id")Long user_id,@Param("receive_man") String receive_man, @Param("address_clear")String address_clear,@Param("phone")String phone);

}
