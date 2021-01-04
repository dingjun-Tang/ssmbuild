package com.dgut.service;

import com.dgut.entity.Role;
import com.dgut.mapper.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleMapper roleMapper;

    public List<Role> getRoleList() {
        return roleMapper.getRoleList();
    }

    public Role getRoleByRoleId(int roleId) {
        return roleMapper.getRoleByRoleId(roleId);
    }

    public int addRole(Role role) {
        return roleMapper.addRole(role);
    }

    public int updateRoleByRoleId(Role role) {
        return roleMapper.updateRoleByRoleId(role);
    }

    public int deleteRoleByRoleId(int roleId) {
        return roleMapper.deleteRoleByRoleId(roleId);
    }
}
