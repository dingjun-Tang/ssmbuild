package com.dgut.service;

import com.dgut.entity.PurchaseItem;
import com.dgut.mapper.PurchaseItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PurchaseItemServiceImpl implements PurchaseItemService{

    @Autowired
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

    public int savePurchaseItemList(Integer purchaseId, List<PurchaseItem> purchaseItemList) {
        List<PurchaseItem> collectList = purchaseItemList.stream().map(item -> {
            item.setPurchaseId(purchaseId);
            return item;
        }).collect(Collectors.toList());
        return purchaseItemMapper.insertPurchaseItemList(collectList);
    }

}
