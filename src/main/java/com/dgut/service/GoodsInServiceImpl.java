package com.dgut.service;

import com.dgut.entity.GoodsIn;
import com.dgut.mapper.GoodsInMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsInServiceImpl implements GoodsInService{

    @Resource
    private GoodsInMapper goodsInMapper;

    public List<GoodsIn> getGoodsIntList() {
        return goodsInMapper.getGoodsIntList();
    }

    public GoodsIn getGoodsInByGoodsInId(int goodsInId) {
        return goodsInMapper.getGoodsInByGoodsInId(goodsInId);
    }

    public int addGoodsIn(GoodsIn goodsIn) {
        return goodsInMapper.addGoodsIn(goodsIn);
    }

    public int updateGoodsInByGoodsInId(GoodsIn goodsIn) {
        return goodsInMapper.updateGoodsInByGoodsInId(goodsIn);
    }

    public int deleteGoodsInByGoodsInId(int goodsInId) {
        return goodsInMapper.deleteGoodsInByGoodsInId(goodsInId);
    }
}
