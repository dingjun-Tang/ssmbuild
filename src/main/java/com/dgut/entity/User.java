package com.dgut.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("user")
@Data
public class User {
    private String userId;
    private String username;
    private String password;
    private String avatar;
    private Date createTime;
    private Date updateTime;
}
