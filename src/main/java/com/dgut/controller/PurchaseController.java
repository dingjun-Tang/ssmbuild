package com.dgut.controller;
import com.dgut.entity.Purchase;
import com.dgut.service.PurchaseService;
import com.dgut.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("purchase")
public class PurchaseController {

    @Resource
    private PurchaseService purchaseService;

    //查询所有采购信息
    @GetMapping("/list")
    public Result getPurchaseList(){
        List<Purchase> purchaseList = purchaseService.getPurchaseList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("purchaseList", purchaseList);
        return Result.success().data(map);
    }

    //根据purchaseId查询采购信息
    @GetMapping("/search")
    public Result getPurchaseByPurchaseId(@RequestParam Integer purchaseId){
        Purchase purchase = purchaseService.getPurchaseByPurchaseId(purchaseId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("purchase", purchase);
        return Result.success().data(map);
    }

    //增加一个采购信息
    @PostMapping("/add")
    public Result addPurchase(@RequestBody Purchase purchase){
        int i = purchaseService.addPurchase(purchase);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据purchaseId修改采购信息
    @PostMapping("/update")
    public Result updatePurchaseByPurchaseId(@RequestBody Purchase purchase){
        int i = purchaseService.updatePurchaseByPurchaseId(purchase);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据purchaseId删除一个采购信息
    @PostMapping("/delete")
    public Result deletePurchaseByPurchaseId(@RequestParam Integer purchaseId){
        int i = purchaseService.deletePurchaseByPurchaseId(purchaseId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

}
