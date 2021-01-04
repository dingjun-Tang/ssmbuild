package com.dgut.controller;

import com.dgut.entity.Goods;
import com.dgut.service.GoodsService;
import com.dgut.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    //查询所有商品，不分页
    @GetMapping("list")
    public Result getGoodsList(){
        List<Goods> goodsList = goodsService.getGoodsList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("goodsList", goodsList);
        return Result.success().data(map);
    }


    //根据goodsId查询商品
    @GetMapping("/search")
    public Result getGoodsByGoodsId(@RequestParam Integer goodsId){
        Goods goods = goodsService.getGoodsByGoodsId(goodsId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("goods", goods);
        return Result.success().data(map);
    }

    //增加一个商品
    @PostMapping("/add")
    public Result getGoodsByGoodsId(@RequestBody Goods goods){
        int i = goodsService.addGoods(goods);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据goodsId修改商品信息
    @PostMapping("/update")
    public Result updateGoodsByGoodsId(@RequestBody Goods goods){
       int i = goodsService.updateGoodsByGoodsId(goods);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据goodsId删除一个商品
    @PostMapping("/delete")
    public Result deleteGoodsByGoodsId(@RequestParam Integer goodsId){
        int i = goodsService.deleteGoodsByGoodsId(goodsId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }


}
