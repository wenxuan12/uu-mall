package com.wenxuan.uumall.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@ApiModel
public class Users {

    @ApiModelProperty("id")
    @JsonProperty("id")
    private Long id;

    @ApiModelProperty("账号手机号")
    @JsonProperty("user_name")
    private String userName;

    @ApiModelProperty("密码")
    @JsonProperty("pass_word")
    private String passWord;

    @ApiModelProperty("昵称")
    @JsonProperty("nick_name")
    private String nickName;

    @ApiModelProperty("性别0未知1男性2女性")
    @JsonProperty("sex")
    private Byte sex;

    @ApiModelProperty("头像url")
    @JsonProperty("head_url")
    private String headUrl;

    @ApiModelProperty("个性签名")
    @JsonProperty("motto")
    private String motto;

    @ApiModelProperty("钱包")
    @JsonProperty("walk_money")
    private BigDecimal walkMoney;

    @ApiModelProperty("状态0正常")
    @JsonProperty("status")
    private Byte status;


}
