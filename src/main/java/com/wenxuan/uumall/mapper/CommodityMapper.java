package com.wenxuan.uumall.mapper;

import com.wenxuan.uumall.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommodityMapper {

    List<Commodity> search(@Param("manager") String manager,@Param("page") Integer page, @Param("per") Integer per);

    @Select("select * from commodity where id = #{id}")
    Commodity findOne(@Param("id") Long id);
}
