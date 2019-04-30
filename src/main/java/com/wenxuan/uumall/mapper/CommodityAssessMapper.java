package com.wenxuan.uumall.mapper;

import com.wenxuan.uumall.entity.CommodityAssess;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommodityAssessMapper {

    @Select("select * from commodity_assess where c_id = #{c_id}")
    List<CommodityAssess> findByCommodity(@Param("c_id") Long c_id);
}
