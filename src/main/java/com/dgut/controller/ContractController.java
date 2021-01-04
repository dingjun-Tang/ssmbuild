package com.dgut.controller;

import com.dgut.entity.Contract;
import com.dgut.entity.ContractItem;
import com.dgut.service.ContractItemService;
import com.dgut.service.ContractService;
import com.dgut.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ContractController {
    @Autowired
    private ContractService contractService;
    @Autowired
    private ContractItemService contractItemService;


    /**
     * 获取合同列表
     * @return
     */
    @GetMapping("/contract")
    public Result getContractList(){
        List<Contract> contractList = contractService.getContractList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("contractList", contractList);
        return Result.success().data(map);
    }

    /**
     * 获取合同信息
     * @param contractId
     * @return
     */
    @GetMapping("/contract/{contractId}")
    public Result getContractByContractId(@PathVariable("contractId") Integer contractId){
        Contract contract = contractService.getContractByContractId(contractId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("contract", contract);
        return Result.success().data(map);
    }

    /**
     * 新增合同信息
     * @param contract
     * @return
     */
    @PostMapping("/contract")
    public Result addContract(@RequestBody Contract contract){
        int i = contractService.addContract(contract);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    /**
     * 更新合同信息
     * @param contract
     * @return
     */
    @PutMapping("/contract")
    public Result updateContractByContractId(@RequestBody Contract contract){
        int i = contractService.updateContractByContractId(contract);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    /**
     * 删除合同信息
     * @param contractId
     * @return
     */
    @PostMapping("/contract/{contractId}")
    public Result deleteContractByContractId(@PathVariable("contractId") Integer contractId){
        int i = contractService.deleteContractByContractId(contractId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    /**
     * 批量插入合同商品信息列表
     * @param contractItemList
     * @return
     */
    @PostMapping("/contract/saveContractItemList")
    public Result saveContractItemList(@RequestBody ContractItem[] contractItemList){
        int i = contractItemService.saveContractItemList(Arrays.asList(contractItemList.clone()));
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }
    /**
     * 批量更新合同商品信息列表
     * @param contractItemList
     * @return
     */
    @PutMapping("/contract/updateContractItemList")
    public Result updateContractItemList(@RequestBody ContractItem[] contractItemList){
        int i = contractItemService.updateContractItemList(Arrays.asList(contractItemList.clone()));
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }


}
