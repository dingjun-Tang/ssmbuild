package com.dgut.service;

import com.dgut.entity.ContractItem;
import com.dgut.mapper.ContractItemMapper;

import javax.annotation.Resource;
import java.util.List;

public class ContractItemServiceImpl implements ContractItemService{

    @Resource
    private ContractItemMapper contractItemMapper;

    public List<ContractItem> getContractItemList() {
        return contractItemMapper.getContractItemList();
    }

    public ContractItem getContractItemByContractItemId(int contractItemId) {
        return contractItemMapper.getContractItemByContractItemId(contractItemId);
    }

    public int addContractItem(ContractItem contractItem) {
        return contractItemMapper.addContractItem(contractItem);
    }

    public int updateContractItemContractItemId(ContractItem contractItem) {
        return contractItemMapper.updateContractItemContractItemId(contractItem);
    }

    public int deleteContractItemByContractItemId(int contractItemId) {
        return contractItemMapper.deleteContractItemByContractItemId(contractItemId);
    }
}
