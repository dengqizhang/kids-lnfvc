package org.example.service.impl;

import org.example.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {


    @Override
    public void test() {
        System.out.println("token");
    }
}
