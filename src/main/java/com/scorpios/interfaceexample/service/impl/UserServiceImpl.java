package com.scorpios.interfaceexample.service.impl;

import com.scorpios.interfaceexample.entity.User;
import com.scorpios.interfaceexample.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author scorpios
 * @description 用户业务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(User user) {
        // 直接编写业务逻辑
        return "success";
    }
}
