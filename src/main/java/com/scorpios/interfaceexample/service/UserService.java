package com.scorpios.interfaceexample.service;


import com.scorpios.interfaceexample.entity.User;

/**
 * @author scorpios
 * @description 用户业务接口
 */
public interface UserService {
    /**
     *
     * @param user 用户对象
     * @return 成功则返回"success"，失败则返回错误信息
     */
    String addUser(User user);
}
