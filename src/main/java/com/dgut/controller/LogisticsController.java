package com.dgut.controller;


import com.dgut.entity.Logistics;
import com.dgut.service.LogisticsService;
import com.dgut.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LogisticsController {

    @Autowired
    private LogisticsService logisticsService;

    //查询所有物流信息
    @GetMapping("/logistics")
    public Result getLogisticsList() {
        List<Logistics> logisticsList = logisticsService.getLogisticsList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("logisticsList", logisticsList);
        return Result.success().data(map);
    }

    //根据LogisticsId查询物流信息
    @GetMapping("/logistics/{logisticsId}")
    public Result getLogisticsByLogisticsId(@PathVariable("logisticsId") Integer logisticsId) {
        Logistics logistics = logisticsService.getLogisticsByLogisticsId(logisticsId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("logistics", logistics);
        return Result.success().data(map);
    }

    //增加一个物流信息
    @PostMapping("/logistics")
    public Result addLogistics(@RequestBody Logistics logistics){
        int i = logisticsService.addLogistics(logistics);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据LogisticsId修改物流信息
    @PutMapping("/logistics")
    public Result updateLogisticsByLogisticsId(@RequestBody Logistics logistics){
      int i = logisticsService.updateLogisticsByLogisticsId(logistics);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据logisticsId删除一个物流信息
    @PostMapping("/logistics/{logisticsId}")
    public Result deleteLogisticsByLogisticsId(@PathVariable("logisticsId") Integer logisticsId) {
        int i = logisticsService.deleteLogisticsByLogisticsId(logisticsId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }



}
