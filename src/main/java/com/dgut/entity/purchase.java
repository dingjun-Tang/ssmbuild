package com.dgut.entity;


import lombok.Data;

import java.util.Date;

@Data
public class purchase {
    private Integer purchaseId;
    private String purchaseNo;
    private Integer contractId;
    private Integer customerId;
    private Integer deliverStatus;
    private Integer logisticsId;
    private Integer payStatus;
    private Double totalPrice;
    private String userId;
    private Date createTime;
    private Date updateTime;

}
