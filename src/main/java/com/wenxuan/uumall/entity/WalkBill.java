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

import java.math.BigDecimal;
import java.time.LocalDateTime;
/**
 * table name:  walk_bill
 * author name: wenxuan
 * create time: 2019-04-25 17:35:51
 */

@Getter
@Setter
@ApiModel
public class WalkBill{

    @ApiModelProperty("id")
    @JsonProperty("id")
	private Long id;
    @ApiModelProperty("用户id")
    @JsonProperty("u_id")
	private Long uId;
    @ApiModelProperty("订单id")
    @JsonProperty("o_id")
	private Long oId;
    @ApiModelProperty("订单金额")
    @JsonProperty("money")
	private BigDecimal money;

    @ApiModelProperty("支付时间")
    @JsonProperty("pat_time")
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
	private LocalDateTime payTime;
    @ApiModelProperty("退款时间")
    @JsonProperty("return_time")
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
	private LocalDateTime returnTime;

    @ApiModelProperty("备注")
    @JsonProperty("menager")
	private String menager;
    @ApiModelProperty("状态")
    @JsonProperty("status")
	private Byte status;

}

