package com.dgut.controller;

import com.dgut.entity.GoodsIn;
import com.dgut.service.GoodsInService;
import com.dgut.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GoodsInController {

    @Autowired
    private GoodsInService goodsInService;

    //查询所有商品-物流信息
    @GetMapping("/goodsIn")
    public Result getGoodsIntList(){
        List<GoodsIn> goodsIntList = goodsInService.getGoodsIntList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("goodsIntList", goodsIntList);
        return Result.success().data(map);
    }

    //根据ID查询商品-物流信息
    @GetMapping("/goodsIn/{goodsInId}")
    public Result getGoodsInByGoodsInId(@PathVariable("goodsInId") Integer goodsInId){
        GoodsIn goodsInByGoodsInId = goodsInService.getGoodsInByGoodsInId(goodsInId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("goodsInByGoodsInId", goodsInByGoodsInId);
        return Result.success().data(map);
    }

    //增加一个商品-物流信息
    @PostMapping("/goodsIn")
    public Result addGoodsIn(@RequestBody GoodsIn goodsIn){
        int i = goodsInService.addGoodsIn(goodsIn);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据goodsInId修改商品-物流信息
    @PutMapping("/goodsIn")
    public Result updateGoodsInByGoodsInId(@RequestBody GoodsIn goodsIn){
        int i = goodsInService.updateGoodsInByGoodsInId(goodsIn);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据goodsInId删除一个商品
    @PostMapping("/goodsIn/{goodsInId}")
    public Result deleteGoodsInByGoodsInId(@PathVariable("goodsInId") Integer goodsInId){
        int i = goodsInService.deleteGoodsInByGoodsInId(goodsInId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }


}
