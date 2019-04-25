package com.wenxuan.uumall.entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.sql.*;
/**
 * table name:  walk_bill
 * author name: wenxuan
 * create time: 2019-04-25 17:35:51
 */

@Getter
@Setter
@ApiModel
public class WalkBill{

	private Long id;
	private Long uId;
	private Long oId;
	private double money;
	private Date payTime;
	private Date returnTime;
	private String menager;
	private int status;

}

