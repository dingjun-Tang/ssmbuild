package com.dgut.controller;


import com.dgut.entity.Customer;
import com.dgut.service.CustomerService;
import com.dgut.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //查询所有客户，不分页
    @GetMapping("/customer")
    public Result getCustomerList(){
        List<Customer> customerList = customerService.getCustomerList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("customerList",customerList);
        return Result.success().data(map);
    }

    //根据customerId查询客户
    @GetMapping("/customer/{customerId}")
    public Result getCustomerByCustomerId(@PathVariable("customerId") Integer customerId){
        Customer customer = customerService.getCustomerByCustomerId(customerId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("customer", customer);
        return Result.success().data(map);
    }

    //增加一个客户
    @PostMapping("/customer")
    public Result addCustomer(@RequestBody Customer customer){
        int i = customerService.addCustomer(customer);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //修改客户信息
    @PutMapping("/customer")
    public Result updateCustomerByCustomerId(@RequestBody Customer customer){
        int i = customerService.updateCustomerByCustomerId(customer);
        if (1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据customerId删除一个客户信息
    @PostMapping("/customer/{customerId}")
    public Result deleteCustomerByCustomerId(@PathVariable("customerId") Integer customerId){
        int i = customerService.deleteCustomerByCustomerId(customerId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

}
