package com.dgut.service;

import com.dgut.entity.ContractItem;

import java.util.List;

public interface ContractItemService {


    //查询所有合同-商品信息
    List<ContractItem> getContractItemList();

    //根据contractItemId查询合同-商品信息
    ContractItem getContractItemByContractItemId(int contractItemId);

    //增加一个合同-商品信息
    int addContractItem(ContractItem contractItem);

    //根据contractItemId修改合同-商品信息
    int updateContractItemContractItemId(ContractItem contractItem);

    //根据contractItemId删除一个合同-商品信息
    int deleteContractItemByContractItemId(int contractItemId);

    // 批量新增合同商品
    int saveContractItemList(List<ContractItem> contractItemList);
    // 批量更新合同商品
    int updateContractItemList(List<ContractItem> contractItemList);
}
