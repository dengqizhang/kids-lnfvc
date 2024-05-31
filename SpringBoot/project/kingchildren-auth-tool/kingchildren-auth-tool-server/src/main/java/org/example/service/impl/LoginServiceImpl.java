package org.example.service.impl;

import org.example.service.LoginService;
import org.example.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private RedisUtil redisUtil;


    public void setUser(int id) {
        //引入redis工具类，将id与token一起存入redis
        System.out.println("获取到传入id："+id);
        //此处token暂时为字符串，计划改为JWT
        redisUtil.setCacheObject(String.valueOf(id),"123");
    }
}
