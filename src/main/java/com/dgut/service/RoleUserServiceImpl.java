package com.dgut.service;

import com.dgut.entity.RoleUser;
import com.dgut.mapper.RoleUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleUserServiceImpl implements RoleUserService{

    @Resource
    private RoleUserMapper roleUserMapper;

    public List<RoleUser> getRoleUserList() {
        return roleUserMapper.getRoleUserList();
    }

    public RoleUser getRoleUserById(int id) {
        return roleUserMapper.getRoleUserById(id);
    }

    public int addRoleUser(RoleUser roleUser) {
        return roleUserMapper.addRoleUser(roleUser);
    }

    public int updateRoleUserById(RoleUser roleUser) {
        return roleUserMapper.updateRoleUserById(roleUser);
    }

    public int deleteRoleUserById(int id) {
        return roleUserMapper.deleteRoleUserById(id);
    }
}
