package com.dgut.service;

import com.dgut.entity.User;
import com.dgut.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    public User getUserByUserId(int userId) {
        return userMapper.getUserByUserId(userId);
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int updateUserByUserId(User user) {
        return userMapper.updateUserByUserId(user);
    }

    public int deleteUserByUserId(int userId) {
        return userMapper.deleteUserByUserId(userId);
    }
}
