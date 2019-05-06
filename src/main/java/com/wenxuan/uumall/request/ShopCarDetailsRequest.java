package com.wenxuan.uumall.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel
public class ShopCarDetailsRequest {

    @ApiModelProperty("属性名")
    @JsonProperty("name")
    private String name;
    @ApiModelProperty("属性信息")
    @JsonProperty("manager")
    private String manager;
}
