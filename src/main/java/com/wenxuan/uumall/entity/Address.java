package com.wenxuan.uumall.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * table name:  address
 * author name: wenxuan
 * create time: 2019-04-25 17:35:51
 */
@Getter
@Setter
@ApiModel
public class Address{

	@ApiModelProperty("id")
	@JsonProperty("id")
	private Long id;
	@ApiModelProperty("用户id")
	@JsonProperty("u_id")
	private Long uId;
	@ApiModelProperty("接收人")
	@JsonProperty("receive_man")
	private String receiveMan;
	@ApiModelProperty("接收省份")
	@JsonProperty("address_sheng")
	private String addressSheng;
	@ApiModelProperty("接收市")
	@JsonProperty("address_shi")
	private String addressShi;
	@ApiModelProperty("接收区")
	@JsonProperty("address_qu")
	private String addressQu;
	@ApiModelProperty("接收详细地址")
	@JsonProperty("address_clear")
	private String addressClear;
	@ApiModelProperty("接收号码")
	@JsonProperty("phone")
	private String phone;
	@ApiModelProperty("状态")
	@JsonProperty("status")
	private Byte status;

}

