package com.wenxuan.uumall.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wenxuan.uumall.result.TimeFormatter.DateTimeDeserializer;
import com.wenxuan.uumall.result.TimeFormatter.DateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
/**
 * table name:  order_list
 * author name: wenxuan
 * create time: 2019-04-25 17:35:51
 */

@Getter
@Setter
@ApiModel
public class OrderList{

    @ApiModelProperty("id")
    @JsonProperty("id")
	private Long id;
    @ApiModelProperty("用户id")
    @JsonProperty("user_id")
	private Long userId;
    @ApiModelProperty("地址id")
    @JsonProperty("address_id")
	private Long addressId;
    @ApiModelProperty("商品id")
    @JsonProperty("c_id")
	private Long cId;

    @ApiModelProperty("支付时间")
    @JsonProperty("pay_time")
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
	private LocalDateTime payTime;
    @ApiModelProperty("更新时间")
    @JsonProperty("upde_time")
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
	private LocalDateTime updeTime;

    @ApiModelProperty("状态")
    @JsonProperty("status")
	private Byte status;

}

