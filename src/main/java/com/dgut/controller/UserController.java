package com.dgut.controller;

import com.dgut.entity.User;
import com.dgut.service.UserService;
import com.dgut.util.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags="用户控制器")
public class UserController {

    @Autowired
    private UserService userService;

    //查询所有User
    @GetMapping("/user")
    public Result getUserList(){
        List<User> userList = userService.getUserList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userList", userList);
        return Result.success().data(map);
    }

    //根据uid查询用户
    @GetMapping("/user/{userId}")
    public Result getUserByUserId(@PathVariable("userId") Integer userId){
        User user = userService.getUserByUserId(userId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", user);
        return Result.success().data(map);
    }

    //增加一个用户
    @PostMapping("/user")
    public Result addUser(@RequestBody User user){
        int i = userService.addUser(user);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //修改用户信息
    @PutMapping("/user")
    public Result updateUserByUserId(@RequestBody User user){
        int i = userService.updateUserByUserId(user);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据uid删除一个用户
    @PostMapping("/user/{userId}")
    public Result deleteUserByUserId(@PathVariable("userId") Integer userId){
        int i = userService.deleteUserByUserId(userId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }


}
