package com.wenxuan.uumall.mapper;

import com.wenxuan.uumall.entity.ClassCommodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClassCommodityMapper {

    @Select("select * from class_commodity where 1 = 1")
    List<ClassCommodity> find();
}
