package com.dgut.service;

import com.dgut.entity.Purchase;
import com.dgut.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    private PurchaseMapper purchaseMapper;

    public List<Purchase> getPurchaseList() {
        return purchaseMapper.getPurchaseList();
    }

    public Purchase getPurchaseByPurchaseId(int purchaseId) {
        return purchaseMapper.getPurchaseByPurchaseId(purchaseId);
    }
    public Purchase getPurchaseByPurchaseNo(String purchaseNo) {
        return purchaseMapper.getPurchaseByPurchaseNo(purchaseNo);
    }

    public Purchase addPurchase(Purchase purchase) {
        String purchaseNo = new Date().toString();
        purchase.setPurchaseNo(purchaseNo);
        if(purchaseMapper.addPurchase(purchase) == 1) {
            return this.getPurchaseByPurchaseNo(purchaseNo);
        }
        return null;
    }

    public int updatePurchaseByPurchaseId(Purchase purchase) {
        return purchaseMapper.updatePurchaseByPurchaseId(purchase);
    }

    public int deletePurchaseByPurchaseId(int purchaseId) {
        return purchaseMapper.deletePurchaseByPurchaseId(purchaseId);
    }
}
