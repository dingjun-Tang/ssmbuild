package com.dgut.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("contract")
@Data
public class Contract {
    private Integer contractId;
    private String contractName;
    private String contractNo;
    private String firstParty;
    private String secondParty;
    private Integer status;
    private Date createTime;
    private Date updateTime;
}
