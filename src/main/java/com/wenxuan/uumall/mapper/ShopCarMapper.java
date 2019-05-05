package com.wenxuan.uumall.mapper;

import com.wenxuan.uumall.entity.ShopCar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShopCarMapper {

    List<ShopCar> find(@Param("u_id")Long u_id,@Param("c_id")Long c_id);

    @Select("select * from shop_car where id = #{id}")
    ShopCar findOne(@Param("id")Long id);

}
