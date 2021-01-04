package com.dgut.controller;


import com.dgut.entity.Contract;
import com.dgut.entity.Logistics;
import com.dgut.service.LogisticsService;
import com.dgut.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/logistics")
public class LogisticsController {

    @Resource
    private LogisticsService logisticsService;

    //查询所有物流信息
    @GetMapping("/list")
    public Result getLogisticsList() {
        List<Logistics> logisticsList = logisticsService.getLogisticsList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("logisticsList", logisticsList);
        return Result.success().data(map);
    }

    //根据LogisticsId查询物流信息
    @GetMapping("/search")
    public Result getLogisticsByLogisticsId(@RequestParam Integer logisticsId) {
        Logistics logistics = logisticsService.getLogisticsByLogisticsId(logisticsId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("logistics", logistics);
        return Result.success().data(map);
    }

    //增加一个物流信息
    @PostMapping("/add")
    public Result addLogistics(@RequestBody Logistics logistics){
        int i = logisticsService.addLogistics(logistics);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据LogisticsId修改物流信息
    @PostMapping("/update")
    public Result updateLogisticsByLogisticsId(@RequestBody Logistics logistics){
      int i = logisticsService.updateLogisticsByLogisticsId(logistics);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据logisticsId删除一个物流信息
    @PostMapping("/delete")
    public Result deleteLogisticsByLogisticsId(@RequestParam Integer logisticsId) {
        int i = logisticsService.deleteLogisticsByLogisticsId(logisticsId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }



}
