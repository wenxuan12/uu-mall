package com.wenxuan.uumall.mapper;

import com.wenxuan.uumall.entity.CommodityManager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommodityManagerMapper {

    @Select("select * from commodity_manager where commodity_id = #{commodity_id}")
    List<CommodityManager> findByCommodity(@Param("commodity_id") Long commodity_id);
}
