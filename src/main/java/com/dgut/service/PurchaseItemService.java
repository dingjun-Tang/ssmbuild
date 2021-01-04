package com.dgut.service;

import com.dgut.entity.PurchaseItem;

import java.util.List;

public interface PurchaseItemService {
    //查询所有采购-商品清单
    List<PurchaseItem> getPurchaseItemList();

    //根据purchaseItemId查询采购-商品清单
    PurchaseItem getPurchaseItemByPurchaseItemId(int purchaseItemId);

    //增加一个采购-商品清单
    int addPurchaseItem(PurchaseItem purchaseItem);

    //根据purchaseItemId修改采购-商品清单
    int updatePurchaseItemByPurchaseItemId(PurchaseItem purchaseItem);

    //根据purchaseItemId删除一个采购-商品清单
    int deletePurchaseItemByPurchaseItemId(int purchaseItemId);
}
