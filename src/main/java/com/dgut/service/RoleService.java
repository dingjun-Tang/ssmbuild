package com.dgut.service;

import com.dgut.entity.Role;

import java.util.List;

public interface RoleService {


    //查询所有角色
    List<Role> getRoleList();

    //根据RoleId查询角色
    Role getRoleByRoleId(int roleId);

    //增加一个角色
    int addRole(Role role);

    //根据RoleId修改角色信息
    int updateRoleByRoleId(Role role);

    //根据RoleId删除一个角色
    int deleteRoleByRoleId(int roleId);


}
