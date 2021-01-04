package com.dgut.controller;

import com.dgut.entity.Purchase;
import com.dgut.entity.PurchaseItem;
import com.dgut.service.PurchaseItemService;
import com.dgut.service.PurchaseService;
import com.dgut.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;
    @Autowired
    private PurchaseItemService purchaseItemService;

    //查询所有采购信息
    @GetMapping("/purchase")
    public Result getPurchaseList(){
        List<Purchase> purchaseList = purchaseService.getPurchaseList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("purchaseList", purchaseList);
        return Result.success().data(map);
    }

    //根据purchaseId查询采购信息
    @GetMapping("/purchase/{purchaseID}")
    public Result getPurchaseByPurchaseId(@PathVariable("purchaseID") Integer purchaseId){
        Purchase purchase = purchaseService.getPurchaseByPurchaseId(purchaseId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("purchase", purchase);
        return Result.success().data(map);
    }

    //增加一个采购信息
    @PostMapping("/purchase")
    public Result addPurchase(@RequestBody Purchase purchase, @RequestBody PurchaseItem[] purchaseItemList){
        Purchase purchase1 = purchaseService.addPurchase(purchase);
        if(purchase1 != null){
            Integer purchaseId = purchase1.getPurchaseId();
            purchaseItemService.savePurchaseItemList(purchaseId, Arrays.asList(purchaseItemList));
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据purchaseId修改采购信息
    @PutMapping("/purchase")
    public Result updatePurchaseByPurchaseId(@RequestBody Purchase purchase){
        int i = purchaseService.updatePurchaseByPurchaseId(purchase);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据purchaseId删除一个采购信息
    @PostMapping("/purchase/{purchaseID}")
    public Result deletePurchaseByPurchaseId(@PathVariable("purchaseID") Integer purchaseId){
        int i = purchaseService.deletePurchaseByPurchaseId(purchaseId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

}
