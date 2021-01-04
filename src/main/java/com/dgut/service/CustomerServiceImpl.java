package com.dgut.service;

import com.dgut.entity.Customer;
import com.dgut.mapper.CustomerMapper;

import javax.annotation.Resource;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    @Resource
    private CustomerMapper customerMapper;

    public List<Customer> getCustomerList() {
        return customerMapper.getCustomerList();
    }

    public Customer getCustomerByCustomerId(int customerId) {
        return customerMapper.getCustomerByCustomerId(customerId);
    }

    public int addCustomer(Customer customer) {
        return customerMapper.addCustomer(customer);
    }

    public int updateCustomerByCustomerId(Customer customer) {
        return customerMapper.updateCustomerByCustomerId(customer);
    }

    public int deleteCustomerByCustomerId(int customerId) {
        return customerMapper.deleteCustomerByCustomerId(customerId);
    }
}
