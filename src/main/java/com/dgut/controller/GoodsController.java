package com.dgut.controller;

import com.dgut.entity.Goods;
import com.dgut.service.GoodsService;
import com.dgut.util.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags="商品控制器")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    //查询所有商品，不分页
    @GetMapping("/goods")
    public Result getGoodsList(){
        List<Goods> goodsList = goodsService.getGoodsList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("goodsList", goodsList);
        return Result.success().data(map);
    }


    //根据goodsId查询商品
    @GetMapping("/goods/{goodsId}")
    public Result getGoodsByGoodsId(@PathVariable("goodsId") Integer goodsId){
        Goods goods = goodsService.getGoodsByGoodsId(goodsId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("goods", goods);
        return Result.success().data(map);
    }

    //增加一个商品
    @PostMapping("/goods")
    public Result getGoodsByGoodsId(@RequestBody Goods goods){
        int i = goodsService.addGoods(goods);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据goodsId修改商品信息
    @PutMapping("/goods")
    public Result updateGoodsByGoodsId(@RequestBody Goods goods){
       int i = goodsService.updateGoodsByGoodsId(goods);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据goodsId删除一个商品
    @PostMapping("/goods/{goodsId}")
    public Result deleteGoodsByGoodsId(@PathVariable("goodsId") Integer goodsId){
        int i = goodsService.deleteGoodsByGoodsId(goodsId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }


}
