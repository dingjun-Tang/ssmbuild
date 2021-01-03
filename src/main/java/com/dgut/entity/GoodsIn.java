package com.dgut.entity;
import java.util.Date;
import lombok.Data;

@Data
public class GoodsIn {
    private Integer goodsInId;
    private Integer count;
    private Integer goodsId;
    private String remark;
    private Integer status;
    private Integer logisticsId;
    private Date createTime;
    private Date updateTime;
}
