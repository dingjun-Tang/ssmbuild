package com.dgut.mapper;

import com.dgut.entity.Purchase;

import java.util.List;

public interface PurchaseMapper {

    //查询所有采购信息
    List<Purchase> getPurchaseList();

    //根据purchaseId查询采购信息
    Purchase getPurchaseByPurchaseId(int purchaseId);

    //增加一个采购信息
    int addPurchase(Purchase purchase);

    //根据purchaseId修改采购信息
    int updatePurchaseByPurchaseId(Purchase purchase);

    //根据purchaseId删除一个采购信息
    int deletePurchaseByPurchaseId(int purchaseId);

}
