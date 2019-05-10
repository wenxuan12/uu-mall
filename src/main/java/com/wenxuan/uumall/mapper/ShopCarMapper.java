package com.wenxuan.uumall.mapper;

import com.wenxuan.uumall.entity.ShopCar;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShopCarMapper {

    @Select("select * from shop_car where user_id = #{user_id}")
    List<ShopCar> find(@Param("user_id")Long user_id);

    @Select("select * from shop_car where user_id = #{user_id} and commodity_id = #{commodity_id}")
    ShopCar findByUserIdAndCommodityId(@Param("user_id")Long user_id,@Param("commodity_id")Long commodity_id);

    @Select("select * from shop_car where id = #{id} ")
    ShopCar findOne(@Param("id")Long id);

    @Insert("insert into shop_car(user_id,commodity_id,number) value (#{user_id},#{commodity_id},#{number})")
    Integer add(@Param("user_id")Long user_id,@Param("commodity_id")Long commodity_id,@Param("number")Long number);

    @Delete("delete from shop_car where id = #{id}")
    Integer delete(@Param("id")Long id);

    @Update("update shop_car set number = #{number} where id = #{id}")
    Integer update(@Param("number")Long number,@Param("id")Long id);
}
