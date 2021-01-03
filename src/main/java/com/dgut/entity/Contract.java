package com.dgut.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Contract {
    private Integer contractId;
    private String contractName;
    private String contractNo;
    private String firstParty;
    private String secondParty;
    private Integer status;
    private Date createTime;
    private Date updateTime;
}
