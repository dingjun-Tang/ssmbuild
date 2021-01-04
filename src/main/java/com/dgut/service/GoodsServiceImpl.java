package com.dgut.service;

import com.dgut.entity.Goods;
import com.dgut.mapper.GoodsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Resource
    private GoodsMapper goodsMapper;

    public List<Goods> getGoodsList() {
        return goodsMapper.getGoodsList();
    }

    public Goods getGoodsByGoodsId(int goodsId) {
        return goodsMapper.getGoodsByGoodsId(goodsId);
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
}
