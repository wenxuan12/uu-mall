package com.wenxuan.uumall.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel
public class CheckLoginRequest {

    @ApiModelProperty("账号")
    @JsonProperty("user_name")
    private String userName;

    @ApiModelProperty("密码")
    @JsonProperty("pass_word")
    private String passWord;

    @ApiModelProperty("验证码")
    @JsonProperty("checking_code")
    private String checkingCode;

}
