package com.dgut.entity;


import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("logistics")
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
