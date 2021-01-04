package com.dgut.controller;

import com.dgut.entity.User;
import com.dgut.service.UserService;
import com.dgut.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    //查询所有User
    @GetMapping("/list")
    public Result getUserList(){
        List<User> userList = userService.getUserList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userList", userList);
        return Result.success().data(map);
    }

    //根据uid查询用户
    @GetMapping("/search")
    public Result getUserByUserId(@RequestParam Integer userId){
        User user = userService.getUserByUserId(userId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", user);
        return Result.success().data(map);
    }

    //增加一个用户
    @PostMapping("/add")
    public Result addUser(@RequestBody User user){
        int i = userService.addUser(user);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //修改用户信息
    @PostMapping("/update")
    public Result updateUserByUserId(@RequestBody User user){
        int i = userService.updateUserByUserId(user);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据uid删除一个用户
    @PostMapping("/delete")
    public Result deleteUserByUserId(@RequestParam Integer userId){
        int i = userService.deleteUserByUserId(userId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }


}
