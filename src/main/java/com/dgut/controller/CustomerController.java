package com.dgut.controller;


import com.dgut.entity.Customer;
import com.dgut.service.CustomerService;
import com.dgut.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    //查询所有客户，不分页
    @GetMapping("list")
    public Result getCustomerList(){
        List<Customer> customerList = customerService.getCustomerList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("customerList",customerList);
        return Result.success().data(map);
    }

    //根据customerId查询客户
    @GetMapping("/search")
    public Result getCustomerByCustomerId(@RequestParam Integer customerId){
        Customer customer = customerService.getCustomerByCustomerId(customerId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("customer", customer);
        return Result.success().data(map);
    }

    //增加一个客户
    @PostMapping("/add")
    public Result addCustomer(@RequestBody Customer customer){
        int i = customerService.addCustomer(customer);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //修改客户信息
    @PostMapping("/update")
    public Result updateCustomerByCustomerId(@RequestBody Customer customer){
        int i = customerService.updateCustomerByCustomerId(customer);
        if (1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据customerId删除一个客户信息
    @PostMapping("/delete")
    public Result deleteCustomerByCustomerId(@RequestParam Integer customerId){
        int i = customerService.deleteCustomerByCustomerId(customerId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

}
