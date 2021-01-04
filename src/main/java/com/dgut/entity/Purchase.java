package com.dgut.entity;


import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("purchase")
@Data
public class Purchase {
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
