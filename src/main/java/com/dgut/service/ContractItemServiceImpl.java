package com.dgut.service;

import com.dgut.entity.ContractItem;
import com.dgut.mapper.ContractItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractItemServiceImpl implements ContractItemService{

    @Autowired
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

    public int saveContractItemList(List<ContractItem> contractItemList) {
        return contractItemMapper.insertContractItemList(contractItemList);
    }

    public int updateContractItemList(List<ContractItem> contractItemList) {
        return contractItemMapper.updateContractItemList(contractItemList);
    }
}
