package com.wenxuan.uumall.entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.sql.*;
/**
 * table name:  shop_car_details
 * author name: wenxuan
 * create time: 2019-04-25 17:35:51
 */

@Getter
@Setter
@ApiModel
public class ShopCarDetails{

	private Long id;
	private Long sId;
	private String name;
	private String manager;

}

