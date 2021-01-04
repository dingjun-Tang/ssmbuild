package com.dgut.service;

import com.dgut.entity.Goods;
import com.dgut.entity.PurchaseItem;
import com.dgut.mapper.GoodsMapper;
import com.dgut.mapper.PurchaseItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PurchaseItemServiceImpl implements PurchaseItemService{

    @Autowired
    private PurchaseItemMapper purchaseItemMapper;
    @Autowired
    private GoodsMapper goodsMapper;

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
    @Transactional
    public int savePurchaseItemList(Integer purchaseId, List<PurchaseItem> purchaseItemList) {
        List<Integer> goodsIdCollect = purchaseItemList.stream().map(PurchaseItem::getGoodsId).collect(Collectors.toList());
        List<Goods> originGoodsList = goodsMapper.getGoodsByGoodsIdList(goodsIdCollect);
        List<Goods> updateGoodsList = new ArrayList<>();
        Map<Integer, Goods> goodsMap = new HashMap<>();
        originGoodsList.stream().map(item->{
            goodsMap.put(item.getGoodsId(), item);
            return item;
        }).collect(Collectors.toList());
        purchaseItemList.stream().map(item->{
            if(goodsMap.containsKey(item.getGoodsId())) {
                Goods goods = goodsMap.get(item.getGoodsId());
                if(goods.getStock()<item.getCount()) {
                    throw new RuntimeException("库存不足");
                }
                goods.setStock(goods.getStock() - item.getCount());
                updateGoodsList.add(goods);
            }else{
                throw new RuntimeException("存在无效商品ID");
            }
            return item;
        }).collect(Collectors.toList());
        int i = goodsMapper.updateGoodsList(updateGoodsList);
        if(i > 0) {
            return purchaseItemMapper.insertPurchaseItemList(purchaseItemList);
        }
        throw new RuntimeException("修改商品失败");
    }

}
