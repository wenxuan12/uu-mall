package com.wenxuan.uumall.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * table name:  shop_car_details
 * author name: wenxuan
 * create time: 2019-04-25 17:35:51
 */

@Getter
@Setter
@ApiModel
public class ShopCarDetails{

	@ApiModelProperty("id")
	@JsonProperty("id")
	private Long id;
	@ApiModelProperty("购物车id")
	@JsonProperty("shop_car_id")
	private Long shopCarId;
	@ApiModelProperty("属性名")
	@JsonProperty("name")
	private String name;
	@ApiModelProperty("属性信息")
	@JsonProperty("manager")
	private String manager;

}

