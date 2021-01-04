package com.dgut.service;

import com.dgut.entity.Logistics;
import com.dgut.mapper.LogisticsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticsServiceImpl implements LogisticsService{

    @Autowired
    private LogisticsMapper logisticsMapper;

    public List<Logistics> getLogisticsList() {
        return logisticsMapper.getLogisticsList();
    }

    public Logistics getLogisticsByLogisticsId(int logisticsId) {
        return logisticsMapper.getLogisticsByLogisticsId(logisticsId);
    }
    public Logistics getLogisticsByLogisticsNo(String logisticsNo) {
        return logisticsMapper.getLogisticsByLogisticsNo(logisticsNo);
    }

    public int addLogistics(Logistics logistics) {
        return logisticsMapper.addLogistics(logistics);
    }

    public int updateLogisticsByLogisticsId(Logistics logistics) {
        return logisticsMapper.updateLogisticsByLogisticsId(logistics);
    }

    public int deleteLogisticsByLogisticsId(int logisticsId) {
        return logisticsMapper.deleteLogisticsByLogisticsId(logisticsId);
    }
}
