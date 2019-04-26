package com.wenxuan.uumall.mapper;

import com.wenxuan.uumall.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommodityMapper {

    List<Commodity> find(@Param("manager") String manager,@Param("page") Integer page, @Param("per") Integer per);
}
