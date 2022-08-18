package com.example.controller;


import com.baomidou.mybatisplus.annotation.TableField;
import com.example.model.User;
import com.example.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping(value = "/list")
    public List<User> getUserList() {

        return userService.getUserlist();
    }

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable String id) {

        return userService.getUserById(Integer.valueOf(id));
    }

    @GetMapping(value = "/getAdminUser")
    public User getAdminUser() {

        return userService.getAdminUser();
    }

    @RequestMapping(value = "/saveUser/{username}/{email}/{phone}")
    public void saveUser(@PathVariable String username, @PathVariable String email, @PathVariable String phone) {

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPhone(phone);

        userService.saveUser(user);

    }

}

