package com.wenxuan.uumall.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * table name:  class_commodity
 * author name: wenxuan
 * create time: 2019-04-25 17:35:51
 */
@Getter
@Setter
@ApiModel
public class ClassCommodity{

	@ApiModelProperty("id")
	@JsonProperty("id")
	private Long id;
	@ApiModelProperty("一级类别")
	@JsonProperty("class_one")
	private String classOne;
	@ApiModelProperty("二级类别")
	@JsonProperty("class_two")
	private String classTwo;

}

