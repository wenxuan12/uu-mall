package com.wenxuan.uumall.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wenxuan.uumall.result.DateTimeDeserializer;
import com.wenxuan.uumall.result.DateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.sql.*;
/**
 * table name:  commodity_assess
 * author name: wenxuan
 * create time: 2019-04-25 17:35:51
 */
@Getter
@Setter
@ApiModel
public class CommodityAssess{

	@ApiModelProperty("id")
	@JsonProperty("id")
	private Long id;
	@ApiModelProperty("商品id")
	@JsonProperty("c_id")
	private Long cId;
	@ApiModelProperty("评价人姓名")
	@JsonProperty("name")
	private String name;
	@ApiModelProperty("评价内容")
	@JsonProperty("comment")
	private String comment;
	@ApiModelProperty("评价图片")
	@JsonProperty("pic_url")
	private String picUrl;
	@ApiModelProperty("底边信息")
	@JsonProperty("manager")
	private String manager;
	@ApiModelProperty("添加时间")
	@JsonProperty("add_time")
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = DateTimeDeserializer.class)
	private LocalDateTime addTime;

}

