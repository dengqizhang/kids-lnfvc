package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.po.UserPo;

import java.util.List;

/**
 * @describe:
 * @Author Cary
 * @Date 2024/5/24
 **/
@Mapper
public interface UserMapper {
    List<UserPo> getUserList();


    UserPo getUser(String username);
}
