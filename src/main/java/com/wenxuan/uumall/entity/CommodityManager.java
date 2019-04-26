package com.wenxuan.uumall.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * table name:  commodity_manager
 * author name: wenxuan
 * create time: 2019-04-25 17:35:51
 */

@Getter
@Setter
@ApiModel
public class CommodityManager{

    @ApiModelProperty("id")
    @JsonProperty("id")
    private Long id;
    @ApiModelProperty("商品id")
    @JsonProperty("c_id")
    private Long cId;
    @ApiModelProperty("商品介绍")
    @JsonProperty("class_name")
    private String className;
    @ApiModelProperty("商品值1")
    @JsonProperty("num_1")
    private String num1;
    @ApiModelProperty("商品值2")
    @JsonProperty("num_2")
    private String num2;
    @ApiModelProperty("商品值3")
    @JsonProperty("num_3")
    private String num3;
    @ApiModelProperty("商品值4")
    @JsonProperty("num_4")
    private String num4;
    @ApiModelProperty("商品值5")
    @JsonProperty("num_5")
    private String num5;
    @ApiModelProperty("商品值6")
    @JsonProperty("num_6")
    private String num6;
    @ApiModelProperty("商品值7")
    @JsonProperty("num_7")
    private String num7;
    @ApiModelProperty("商品值8")
    @JsonProperty("num_8")
    private String num8;
    @ApiModelProperty("商品值9")
    @JsonProperty("num_9")
    private String num9;
    @ApiModelProperty("商品值10")
    @JsonProperty("num_10")
	private String num10;
    @ApiModelProperty("商品值11")
    @JsonProperty("num_11")
	private String num11;
    @ApiModelProperty("商品值12")
    @JsonProperty("num_12")
	private String num12;
    @ApiModelProperty("商品值13")
    @JsonProperty("num_13")
	private String num13;
    @ApiModelProperty("商品值14")
    @JsonProperty("num_14")
	private String num14;
    @ApiModelProperty("商品值15")
    @JsonProperty("num_15")
	private String num15;
    @ApiModelProperty("商品值16")
    @JsonProperty("num_16")
	private String num16;

}

