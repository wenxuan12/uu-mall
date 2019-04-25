package com.wenxuan.uumall.entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.sql.*;
/**
 * table name:  commodity_details
 * author name: wenxuan
 * create time: 2019-04-25 17:35:51
 */

@Getter
@Setter
@ApiModel
public class CommodityDetails{

	private Long id;
	private Long cId;
	private String calssName;
	private String num1;
	private String num2;
	private String num3;
	private String num4;
	private String num5;
	private String num6;
	private String num7;
	private String num8;
	private String num9;

}

