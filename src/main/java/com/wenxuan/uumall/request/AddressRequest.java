package com.wenxuan.uumall.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@ApiModel
public class AddressRequest {

    @ApiModelProperty("用户id")
    @JsonProperty("user_id")
    private Long userId;

    @ApiModelProperty("接收人")
    @JsonProperty("receive_man")
    private String receiveMan;

    @ApiModelProperty("接收详细地址")
    @JsonProperty("address_clear")
    private String addressClear;

    @ApiModelProperty("接收号码")
    @JsonProperty("phone")
    private String phone;

}
