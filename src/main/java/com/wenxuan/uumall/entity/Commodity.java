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
 * table name:  commodity
 * author name: wenxuan
 * create time: 2019-04-25 17:31:35
 */
@Getter
@Setter
@ApiModel
public class Commodity{

	@ApiModelProperty("id")
	@JsonProperty("id")
	private Long id;
	@ApiModelProperty("商家id")
	@JsonProperty("b_id")
	private Long bId;
	@ApiModelProperty("商品名称")
	@JsonProperty("name")
	private String name;
	@ApiModelProperty("商品图片")
	@JsonProperty("pic_url")
	private String picUrl;
	@ApiModelProperty("一级类别")
	@JsonProperty("class_one")
	private String classOne;
	@ApiModelProperty("二级类别")
	@JsonProperty("class_two")
	private String classTwo;
	@ApiModelProperty("三级类别")
	@JsonProperty("class_Three")
	private String classThree;
	@ApiModelProperty("旧价格")
	@JsonProperty("old_price")
	private BigDecimal oldPrice;
	@ApiModelProperty("新价格")
	@JsonProperty("price")
	private BigDecimal price;
	@ApiModelProperty("数量")
	@JsonProperty("stock")
	private Long stock;
	@ApiModelProperty("重量")
	@JsonProperty("weight")
	private String weight;
	@ApiModelProperty("评价总数")
	@JsonProperty("con_assess")
	private String conAssess;
	@ApiModelProperty("好评率")
	@JsonProperty("assess_lv")
	private Long assessLv;

	@ApiModelProperty("添加时间")
	@JsonProperty("add_time")
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = DateTimeDeserializer.class)
	private LocalDateTime addTime;

	@ApiModelProperty("更新时间")
	@JsonProperty("upde_time")
	@JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = DateTimeDeserializer.class)
	private LocalDateTime updeTime;

	@ApiModelProperty("京东图片")
	@JsonProperty("jd_url")
	private String jdUrl;
	@ApiModelProperty("状态")
	@JsonProperty("status")
	private Byte status;

}

