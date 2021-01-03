package com.dgut.entity;


import lombok.Data;

import java.util.Date;

@Data
public class purchaseItem {
    private Integer purchaseItemId;
    private Integer count;
    private Integer goodsId;
    private Double perPrice;
    private Double price;
    private Integer purchaseId;
    private Date createTime;
    private Date updateTime;
}
