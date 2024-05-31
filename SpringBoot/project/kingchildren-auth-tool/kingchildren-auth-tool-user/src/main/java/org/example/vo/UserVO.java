package org.example.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.po.UserPo;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
    //用户信息
    private UserPo user;

    //token
    private String token;
}
