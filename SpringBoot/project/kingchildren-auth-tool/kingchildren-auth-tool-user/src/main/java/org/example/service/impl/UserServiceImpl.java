package org.example.service.impl;

import org.example.mapper.UserMapper;
import org.example.po.UserPo;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public UserPo getUser(String username) {
        UserPo user = userMapper.getUser(username);
        System.out.println(user);
        return user;
    }
}
