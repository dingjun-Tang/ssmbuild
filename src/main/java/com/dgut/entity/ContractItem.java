package com.dgut.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ContractItem {
    private Integer contractItemId;
    private Integer contractId;
    private Integer count;
    private Integer leaveCount;
    private Double perPrice;
    private Double price;
    private Integer goodsId;
    private Date createTime;
    private Date updateTime;
}
