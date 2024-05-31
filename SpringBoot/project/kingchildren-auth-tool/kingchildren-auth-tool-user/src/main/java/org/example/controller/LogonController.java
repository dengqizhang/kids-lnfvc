package org.example.controller;

import com.alibaba.fastjson.JSONObject;
import org.example.handker.UserContextHandler;
import org.example.po.UserPo;
import org.example.service.impl.LoginServiceImpl;
import org.example.service.UserService;
import org.example.util.RedisUtil;
import org.example.util.ResultUtils;
import org.example.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
    @Resource
    private RedisUtil redisUtil;

    @PostMapping("/login")
    public ResultUtils login(@RequestBody String body){
        UserPo userParam = JSONObject.parseObject(body, UserPo.class);
        UserPo user = userService.getUser(userParam.getUsername());


        if (user != null && userParam.getPassword().equals(user.getPassword())){
            //此处返回前端token，用于下一步接口鉴权
            loginService.setUser(user.getId());
            //存入上下文
            UserContextHandler.setUserId(user.getId());
            //拼接用户信息和token返回前端
            UserVO userVO = new UserVO();
            userVO.setUser(user);
            userVO.setToken(redisUtil.getCacheObject(String.valueOf(user.getId())));
            return ResultUtils.success(userVO);
        }else {
          return   ResultUtils.fail();
        }
    }


}
