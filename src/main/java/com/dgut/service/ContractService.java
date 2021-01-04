package com.dgut.service;

import com.dgut.entity.Contract;

import java.util.List;

public interface ContractService {

    //查询所有合同
    List<Contract> getContractList();

    //根据ID查询合同
    Contract getContractByContractId(int contractId);

    //增加一个合同
    int addContract(Contract contract);

    //修改合同信息
    int updateContractByContractId(Contract user);

    //根据ID删除一个合同
    int deleteContractByContractId(int contractId);

}
