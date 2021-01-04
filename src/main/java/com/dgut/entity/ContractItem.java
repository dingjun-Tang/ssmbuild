package com.dgut.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("contractItem")
@Data
public class ContractItem {
    private Integer contractItemId;
    private Integer contractId;
    private Integer count;
    private Integer goodsId;
    private Integer leaveCount;
    private Double perPrice;
    private Double price;
    private Date createTime;
    private Date updateTime;
}
