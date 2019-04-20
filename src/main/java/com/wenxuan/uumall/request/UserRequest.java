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
public class UserRequest {

    @ApiModelProperty("账号")
    @JsonProperty("user_name")
    private String userName;

    @ApiModelProperty("密码")
    @JsonProperty("pass_word")
    private String passWord;

    @ApiModelProperty("昵称")
    @JsonProperty("nick_name")
    private String nickName;

    @ApiModelProperty("性别0男性1女性")
    @JsonProperty("sex")
    private Integer sex;

    @ApiModelProperty("头像url")
    @JsonProperty("head_url")
    private String headUrl;

    @ApiModelProperty("个性签名")
    @JsonProperty("motto")
    private String motto;

    @ApiModelProperty("钱包")
    @JsonProperty("walk_money")
    private BigDecimal walkMoney;

    @ApiModelProperty("状态")
    @JsonProperty("status")
    private Integer status;
}
