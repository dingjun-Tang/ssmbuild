package com.dgut.service;

import com.dgut.entity.Goods;

import java.util.List;

public interface GoodsService {

    //查询所有商品
    List<Goods> getGoodsList();

    //根据goodsId查询商品
    Goods getGoodsByGoodsId(int goodsId);

    //根据goodsIdList查询商品详细信息列表
    public List<Goods> getGoodsByGoodsIdList(List<Integer> goodsIdList);

    //增加一个商品
    int addGoods(Goods goods);

    //根据goodsId修改商品信息
    int updateGoodsByGoodsId(Goods goods);

    //根据goodsId删除一个商品
    int deleteGoodsByGoodsId(int goodsId);

    //批量更新商品列表
    public int updateGoodsList(List<Goods> goodsList);

}
