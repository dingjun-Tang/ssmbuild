package com.dgut.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Logistics {
    private Integer logisticsId;
    private String addresseeAddress;
    private String addresseeName;
    private String addresseePhone;
    private String companyName;
    private String logisticsNo;
    private String senderAddress;
    private String senderName;
    private String senderPhone;
    private Date createTime;
    private Date updateTime;
}
