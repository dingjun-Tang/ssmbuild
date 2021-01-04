package com.dgut.controller;

import com.dgut.entity.Contract;
import com.dgut.mapper.ContractMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ContractController {

    @Resource
    private ContractMapper contractMapper;

    @ResponseBody
    @RequestMapping("/contract/list")
    public String test(){
        List<Contract> contractList = contractMapper.getContractList();
        for(Contract contract: contractList){
            System.out.println(contract);
        }
        return "ssbb";
    }
}
