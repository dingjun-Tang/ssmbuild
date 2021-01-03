package com.dgut.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Customer {
    private Integer customerId;
    private String address;
    private String email;
    private String name;
    private String phone;
    private String userId;
    private Date createTime;
    private Date updateTime;
}
