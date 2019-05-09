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
public class ShopCarDto {

    @ApiModelProperty("id")
    @JsonProperty("id")
    private Long id;
    @ApiModelProperty("用户id")
    @JsonProperty("u_id")
    private Long uId;
    @ApiModelProperty("商品id")
    @JsonProperty("c_id")
    private Long cId;

    @ApiModelProperty("商品属性")
    @JsonProperty("list_details")
    private List<ShopCarDetailsDto> listDetails;

    @ApiModelProperty("商品信息")
    @JsonProperty("commodity")
    private CommodityDto commodity;
}
