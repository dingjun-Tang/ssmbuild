package com.dgut.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("customer")
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
