package com.wenxuan.uumall.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@ApiModel
public class CommoditySimpleDto {

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

    @ApiModelProperty("京东图片")
    @JsonProperty("jd_url")
    private String jdUrl;

    @ApiModelProperty("商家店名")
    @JsonProperty("business_name")
    private String businessName;

}
