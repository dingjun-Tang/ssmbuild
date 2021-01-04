package com.dgut.service;

import com.dgut.entity.PurchaseItem;
import com.dgut.mapper.PurchaseItemMapper;
import com.dgut.mapper.PurchaseMapper;

import javax.annotation.Resource;
import java.util.List;

public class PurchaseItemServiceImpl implements PurchaseItemService{

    @Resource
    private PurchaseItemMapper purchaseItemMapper;

    public List<PurchaseItem> getPurchaseItemList() {
        return purchaseItemMapper.getPurchaseItemList();
    }

    public PurchaseItem getPurchaseItemByPurchaseItemId(int purchaseItemId) {
        return purchaseItemMapper.getPurchaseItemByPurchaseItemId(purchaseItemId);
    }

    public int addPurchaseItem(PurchaseItem purchaseItem) {
        return purchaseItemMapper.addPurchaseItem(purchaseItem);
    }

    public int updatePurchaseItemByPurchaseItemId(PurchaseItem purchaseItem) {
        return purchaseItemMapper.updatePurchaseItemByPurchaseItemId(purchaseItem);
    }

    public int deletePurchaseItemByPurchaseItemId(int purchaseItemId) {
        return purchaseItemMapper.deletePurchaseItemByPurchaseItemId(purchaseItemId);
    }
}
