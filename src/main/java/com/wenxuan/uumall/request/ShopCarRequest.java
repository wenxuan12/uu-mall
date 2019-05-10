package com.wenxuan.uumall.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@ApiModel
public class ShopCarRequest {

    @ApiModelProperty("用户id")
    @JsonProperty("user_id")
    private Long uId;
    @ApiModelProperty("商品id")
    @JsonProperty("commodity_id")
    private Long commodityId;

    @ApiModelProperty("商品属性")
    @JsonProperty("list_details")
    private List<ShopCarDetailsRequest> listDetails;
}
