package com.dgut.mapper;

import com.dgut.entity.Goods;

import java.util.List;

public interface GoodsMapper {

    //查询所有商品
    List<Goods> getGoodsList();

    //根据goodsId查询商品
    Goods getGoodsByGoodsId(int goodsId);

    //增加一个商品
    int addGoods(Goods goods);

    //根据goodsId修改商品信息
    int updateGoodsByGoodsId(Goods goodsId);

    //根据goodsId删除一个商品
    int deleteGoodsByGoodsId(int goodsId);

    int updateGoodsList(List<Goods> goodsList);

    List<Goods> getGoodsByGoodsIdList(List<Integer> goodsIdList);

}
