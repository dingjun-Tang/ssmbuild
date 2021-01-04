package com.dgut.service;

import com.dgut.entity.Contract;
import com.dgut.mapper.ContractMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContractServiceImpl implements ContractService{

    @Resource
    private ContractMapper contractMapper;

    public List<Contract> getContractList() {
        return contractMapper.getContractList();
    }

    public Contract getContractByContractId(int contractId) {
        return contractMapper.getContractByContractId(contractId);
    }

    public int addContract(Contract contract) {
        return contractMapper.addContract(contract);
    }

    public int updateContractByContractId(Contract contract) {
        return contractMapper.updateContractByContractId(contract);
    }

    public int deleteContractByContractId(int contractId) {
        return contractMapper.deleteContractByContractId(contractId);
    }
}
