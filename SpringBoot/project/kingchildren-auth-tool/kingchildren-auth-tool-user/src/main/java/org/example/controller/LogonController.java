package org.example.controller;

import com.alibaba.fastjson.JSONObject;
import org.example.po.UserPo;
import org.example.service.impl.LoginServiceImpl;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @describe:
 * @Author Cary
 * @Date 2024/5/24
 **/
@RestController
public class LogonController {

    @Resource
    private UserService userService ;

    @Resource
    private LoginServiceImpl loginService;


    @PostMapping("/login")
    public String login(@RequestBody String body){
        UserPo userParam = JSONObject.parseObject(body, UserPo.class);
        UserPo user = userService.getUser(userParam.getUsername());

        if (user != null && userParam.getPassword().equals(user.getPassword())){
            //此处返回前端token，用于下一步接口鉴权
            return "登录成功";
        }else {
            return "登录失败";
        }
    }


}
