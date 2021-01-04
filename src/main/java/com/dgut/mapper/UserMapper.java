package com.dgut.mapper;

import com.dgut.entity.User;

import java.util.List;

public interface UserMapper {

    //查询所有User
    List<User> getUserList();

    //根据uid查询用户
    User getUserByUserId(int userId);

    //增加一个用户
    int addUser(User user);

    //修改用户信息
    int updateUserByUserId(User user);

    //根据uid删除一个用户
    int deleteUserByUserId(int userId);

}
