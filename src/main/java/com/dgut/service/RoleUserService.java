package com.dgut.service;

import com.dgut.entity.RoleUser;

import java.util.List;

public interface RoleUserService {


    //查询所有用户_角色清单
    List<RoleUser> getRoleUserList();

    //根据Id查询用户_角色清单
    RoleUser getRoleUserById(int id);

    //增加一个用户_角色清单
    int addRoleUser(RoleUser roleUser);

    //根据Id修改用户_角色清单
    int updateRoleUserById(RoleUser roleUser);

    //根据Id删除一个用户_角色清单
    int deleteRoleUserById(int id);
}
