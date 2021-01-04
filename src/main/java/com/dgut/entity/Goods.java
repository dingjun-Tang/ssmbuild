package com.dgut.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("goods")
@Data
public class Goods {
    private Integer goodsId;
    private String goodsDescription;
    private String goodsName;
    private Double perPrice;
    private Integer status;
    private Integer stock;
    private Date createTime;
    private Date updateTime;

}
