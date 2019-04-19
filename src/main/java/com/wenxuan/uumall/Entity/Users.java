package com.wenxuan.uumall.Entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Users {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("pass_word")
    private String passWord;
    @JsonProperty("nick_name")
    private String nickName;
    @JsonProperty("sex")
    private Integer sex;
    @JsonProperty("head_url")
    private String headUrl;
    @JsonProperty("motto")
    private String motto;
    @JsonProperty("walk_money")
    private BigDecimal walkMoney;
    @JsonProperty("status")
    private Integer status;


}
