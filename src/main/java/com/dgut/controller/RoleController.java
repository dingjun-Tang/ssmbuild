package com.dgut.controller;

import com.dgut.entity.Role;
import com.dgut.service.RoleService;
import com.dgut.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    //查询所有角色
    @GetMapping("/role")
    public Result getRoleList(){
        List<Role> roleList = roleService.getRoleList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("roleList", roleList);
        return Result.success().data(map);
    }

    //根据RoleId查询角色
    @GetMapping("/role/{roleId}")
    public Result getRoleByRoleId(@PathVariable("roleId") Integer roleId){
        Role role = roleService.getRoleByRoleId(roleId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("role", role);
        return Result.success().data(map);
    }

    //增加一个角色
    @PostMapping("/role")
    public Result addRole(@RequestBody Role role){
        int i = roleService.addRole(role);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据RoleId修改角色信息
    @PutMapping("/role")
    public Result updateRoleByRoleId(@RequestBody Role role){
        int i = roleService.updateRoleByRoleId(role);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

    //根据RoleId删除一个角色
    @PostMapping("/role")
    public Result deleteContractByContractId(@RequestParam Integer roleId){
        int i = roleService.deleteRoleByRoleId(roleId);
        if(1 == i){
            return Result.success();
        }else{
            return Result.error();
        }
    }

}
