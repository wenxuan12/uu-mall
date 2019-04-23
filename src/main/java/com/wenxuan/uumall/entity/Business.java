package com.wenxuan.uumall.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel
public class Business {

    @ApiModelProperty("id")
    @JsonProperty("id")
    private Integer id;

    @ApiModelProperty("账号手机号")
    @JsonProperty("user_name")
    private String userName;

    @ApiModelProperty("密码")
    @JsonProperty("pass_word")
    private String passWord;

    @ApiModelProperty("昵称")
    @JsonProperty("nick_name")
    private String nickName;

    @ApiModelProperty("头像url")
    @JsonProperty("head_url")
    private String headUrl;

    @ApiModelProperty("个性签名")
    @JsonProperty("motto")
    private String motto;

    @ApiModelProperty("状态0正常")
    @JsonProperty("status")
    private Integer status;

}
