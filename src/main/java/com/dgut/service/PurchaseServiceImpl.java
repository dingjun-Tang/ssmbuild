package com.dgut.service;

import com.dgut.entity.Purchase;
import com.dgut.mapper.PurchaseMapper;

import javax.annotation.Resource;
import java.util.List;

public class PurchaseServiceImpl implements PurchaseService{

    @Resource
    private PurchaseMapper purchaseMapper;

    public List<Purchase> getPurchaseList() {
        return purchaseMapper.getPurchaseList();
    }

    public Purchase getPurchaseByPurchaseId(int purchaseId) {
        return purchaseMapper.getPurchaseByPurchaseId(purchaseId);
    }

    public int addPurchase(Purchase purchase) {
        return purchaseMapper.addPurchase(purchase);
    }

    public int updatePurchaseByPurchaseId(Purchase purchase) {
        return purchaseMapper.updatePurchaseByPurchaseId(purchase);
    }

    public int deletePurchaseByPurchaseId(int purchaseId) {
        return purchaseMapper.deletePurchaseByPurchaseId(purchaseId);
    }
}
