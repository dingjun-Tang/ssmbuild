package com.dgut.controller;

import com.dgut.entity.Logistics;
import com.dgut.entity.Purchase;
import com.dgut.entity.PurchaseItem;
import com.dgut.service.LogisticsService;
import com.dgut.service.PurchaseItemService;
import com.dgut.service.PurchaseService;
import com.dgut.util.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@Api(tags="采购清单控制器")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;
    @Autowired
    private PurchaseItemService purchaseItemService;
    @Autowired
    LogisticsService logisticsService;

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
    @PostMapping("/purchase/{purchaseId}")
    public Result deletePurchaseByPurchaseId(@PathVariable("purchaseId") Integer purchaseId){
        int i = purchaseService.deletePurchaseByPurchaseId(purchaseId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    @PostMapping("/purchase/{purchaseId}/deliver")
    public Result deliverPurchaseByPurchaseId(@PathVariable("purchaseId") Integer purchaseId){
        Purchase purchase = purchaseService.getPurchaseByPurchaseId(purchaseId);
        if(purchase == null) {
            throw new RuntimeException("采购清单不存在");
        }
        Logistics logistics = new Logistics();
        logistics.setAddresseeName("甲方");
        logistics.setAddresseePhone("13546273647");
        logistics.setAddresseeAddress("广东省东莞市松山湖");
        logistics.setSenderName("乙方");
        logistics.setSenderPhone("13546273647");
        logistics.setSenderAddress("广东省东莞市大岭山");
        logistics.setCompanyName("顺丰");
        String logisticsNo = new Date().toString();
        logistics.setLogisticsNo(logisticsNo);
        int i = logisticsService.addLogistics(logistics);
        if(i == 0) {
            throw new RuntimeException("新增物流信息异常");
        }
        Logistics logistics1 = logisticsService.getLogisticsByLogisticsNo(logisticsNo);
        Integer logisticsId = logistics1.getLogisticsId();
        purchase.setLogisticsId(logisticsId);
        purchase.setDeliverStatus(1);
        int i1 = purchaseService.updatePurchaseByPurchaseId(purchase);
        if(i1 > 0) {
            return Result.success();
        }else{
            throw new RuntimeException("更新采购清单信息异常");
        }
    }
}
