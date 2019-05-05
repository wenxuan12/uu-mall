package com.wenxuan.uumall.mapper;


import com.wenxuan.uumall.entity.ShopCarDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShopCarDetailsMapper {

    @Select("select * from shop_car_details where s_id = #{s_id}")
    List<ShopCarDetails> find(@Param("s_id")Long s_id);

}
