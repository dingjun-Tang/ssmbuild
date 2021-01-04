package com.dgut.controller;

import com.dgut.entity.Contract;
import com.dgut.service.ContractService;
import com.dgut.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/contract")
public class ContractController {
    @Resource
    private ContractService contractService;


    //查询所有合同,不分页
    @GetMapping("/list")
    public Result getContractList(){
        List<Contract> contractList = contractService.getContractList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("contractList", contractList);
        return Result.success().data(map);
    }

    @GetMapping("/search")
    public Result getContractByContractId(@RequestParam Integer contractId){
        Contract contract = contractService.getContractByContractId(contractId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("contract", contract);
        return Result.success().data(map);
    }

    @PostMapping("/add")
    public Result addContract(@RequestBody Contract contract){
        int i = contractService.addContract(contract);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    @PostMapping("/update")
    public Result updateContractByContractId(@RequestBody Contract contract){
        int i = contractService.updateContractByContractId(contract);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    @PostMapping("/delete")
    public Result deleteContractByContractId(@RequestParam Integer contractId){
        int i = contractService.deleteContractByContractId(contractId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

}
