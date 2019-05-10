package com.wenxuan.uumall.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel
public class OrderListRequest {
    @ApiModelProperty("用户id")
    @JsonProperty("user_id")
    private Long userId;
    @ApiModelProperty("地址id")
    @JsonProperty("address_id")
    private Long addressId;
    @ApiModelProperty("商品id")
    @JsonProperty("commodity_id")
    private Long commodityId;

    @ApiModelProperty("购物车id")
    @JsonProperty("shop_car_id")
    private Long shopCarId;
}
