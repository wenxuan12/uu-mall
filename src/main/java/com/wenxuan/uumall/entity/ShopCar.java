package com.wenxuan.uumall.entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.sql.*;
/**
 * table name:  shop_car
 * author name: wenxuan
 * create time: 2019-04-25 17:35:51
 */

@Getter
@Setter
@ApiModel
public class ShopCar{

	private Long id;
	private Long uId;
	private Long aId;

}

