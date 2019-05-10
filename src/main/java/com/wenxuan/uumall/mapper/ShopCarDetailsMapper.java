package com.wenxuan.uumall.mapper;


import com.wenxuan.uumall.entity.ShopCarDetails;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShopCarDetailsMapper {

    @Select("select * from shop_car_details where shop_car_id = #{shop_car_id}")
    List<ShopCarDetails> find(@Param("shop_car_id")Long shop_car_id);

    @Insert("insert into shop_car_details(shop_car_id,name,manager) value (#{shop_car_id},#{name},#{manager}")
    Integer add(@Param("shop_car_id")Long shop_car_id,@Param("name")String name,@Param("manager")String manager);
}
