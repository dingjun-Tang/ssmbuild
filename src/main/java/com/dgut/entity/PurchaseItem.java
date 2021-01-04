package com.dgut.entity;


import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("purchaseItem")
@Data
public class PurchaseItem {
    private Integer purchaseItemId;
    private Integer count;
    private Integer goodsId;
    private Double perPrice;
    private Double price;
    private Integer purchaseId;
    private Date createTime;
    private Date updateTime;
}
