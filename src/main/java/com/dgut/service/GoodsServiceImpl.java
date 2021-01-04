package com.dgut.service;

import com.dgut.entity.Goods;
import com.dgut.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsMapper goodsMapper;

    public List<Goods> getGoodsList() {
        return goodsMapper.getGoodsList();
    }

    public Goods getGoodsByGoodsId(int goodsId) {
        return goodsMapper.getGoodsByGoodsId(goodsId);
    }

    public List<Goods> getGoodsByGoodsIdList(List<Integer> goodsIdList) {
        return goodsMapper.getGoodsByGoodsIdList(goodsIdList);
    }

    public int addGoods(Goods goods) {
        return goodsMapper.addGoods(goods);
    }

    public int updateGoodsByGoodsId(Goods goods) {
        return goodsMapper.updateGoodsByGoodsId(goods);
    }

    public int deleteGoodsByGoodsId(int goodsId) {
        return goodsMapper.deleteGoodsByGoodsId(goodsId);
    }

    public int updateGoodsList(List<Goods> goodsList) {
        return goodsMapper.updateGoodsList(goodsList);
    }
}
