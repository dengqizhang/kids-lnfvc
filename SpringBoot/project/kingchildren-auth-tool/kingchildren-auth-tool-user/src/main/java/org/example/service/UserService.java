package org.example.service;

import org.example.po.UserPo;

public interface UserService {
    UserPo getUser(String username);
}
