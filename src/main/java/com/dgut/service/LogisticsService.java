package com.dgut.service;

import com.dgut.entity.Logistics;

import java.util.List;

public interface LogisticsService {

    //查询所有物流信息
    List<Logistics> getLogisticsList();

    //根据LogisticsId查询物流信息
    Logistics getLogisticsByLogisticsId(int logisticsId);
    Logistics getLogisticsByLogisticsNo(String logisticsNo);

    //增加一个物流信息
    int addLogistics(Logistics logistics);

    //根据LogisticsId修改物流信息
    int updateLogisticsByLogisticsId(Logistics logistics);

    //根据logisticsId删除一个物流信息
    int deleteLogisticsByLogisticsId(int logisticsId);
}
