package com.scorpios.interfaceexample.controller;

import com.scorpios.interfaceexample.entity.User;
import com.scorpios.interfaceexample.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author scorpios
 * @description 用户接口
 */
@RestController
@Api(tags = "用户接口")
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("添加用户")
    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user) {
        return userService.addUser(user);
    }

    @ApiOperation("获得单个用户")
    @GetMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setAccount("8888888");
        user.setPassword("888888888");
        user.setEmail("888888@qq.com");
        return user;
    }

}
