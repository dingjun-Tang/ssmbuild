package com.dgut.mapper;

import com.dgut.entity.GoodsIn;

import java.util.List;

public interface GoodsInMapper {

    //查询所有商品-物流信息
    List<GoodsIn> getGoodsIntList();

    //根据ID查询商品-物流信息
    GoodsIn getGoodsInByGoodsInId(int goodsInId);

    //增加一个商品-物流信息
    int addGoodsIn(GoodsIn goodsIn);

    //根据goodsInId修改商品-物流信息
    int updateGoodsInByGoodsInId(GoodsIn goodsIn);

    //根据goodsInId删除一个商品-物流信息
    int deleteGoodsInByGoodsInId(int goodsInId);
}
