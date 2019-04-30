package com.wenxuan.uumall.mapper;

import com.wenxuan.uumall.entity.CommodityManager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommodityManagerMapper {

    @Select("select * from commodity_manager where c_id = #{c_id}")
    List<CommodityManager> findByCommodity(@Param("c_id") Long c_id);
}
