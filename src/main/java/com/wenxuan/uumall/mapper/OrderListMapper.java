package com.wenxuan.uumall.mapper;


import com.wenxuan.uumall.entity.OrderList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface OrderListMapper {

    List<OrderList> find(@Param("u_id")Long u_id, @Param("c_id")Long c_id);

    @Insert("insert into order_list(u_id,a_id,c_id,pay_time,upde_time) value (u_id,a_id,c_id,pay_time,upde_time)")
    OrderList add(@Param("u_id")Long u_id, @Param("a_id")Long a_id, @Param("c_id")Long c_id, @Param("pay_time") LocalDateTime pay_time,@Param("upde_time") LocalDateTime upde_time);

}
