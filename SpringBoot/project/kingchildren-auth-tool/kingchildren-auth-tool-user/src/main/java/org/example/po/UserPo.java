package org.example.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @describe:
 * @Author Cary
 * @Date 2024/5/24
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserPo {
    private int id;
    private String username;
    private String password;
    private String email;
    private int role_id;
}
