package com.dgut.service;

import com.dgut.entity.Customer;

import java.util.List;

public interface CustomerService {

    //查询所有客户
    List<Customer> getCustomerList();

    //根据customerId查询客户
    Customer getCustomerByCustomerId(int customerId);

    //增加一个客户
    int addCustomer(Customer customer);

    //修改客户信息
    int updateCustomerByCustomerId(Customer customer);

    //根据customerId删除一个客户信息
    int deleteCustomerByCustomerId(int customerId);

}
