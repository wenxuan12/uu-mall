package com.wenxuan.uumall.mapper;


import com.wenxuan.uumall.entity.OrderList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface OrderListMapper {

    @Select("select * from order_list where user_id = #{user_id}")
    List<OrderList> find(@Param("user_id")Long user_id);

    @Insert("insert into order_list(user_id,address_id,commodity_id,pay_time) value (#{user_id},#{address_id},#{commodity_id},#{pay_time})")
    Integer add(@Param("user_id")Long user_id, @Param("address_id")Long address_id, @Param("commodity_id")Long commodity_id, @Param("pay_time") LocalDateTime pay_time);

}
