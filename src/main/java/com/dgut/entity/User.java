package com.dgut.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String userId;
    private String username;
    private String password;
    private String avatar;
    private Date createTime;
    private Date updateTime;
}
