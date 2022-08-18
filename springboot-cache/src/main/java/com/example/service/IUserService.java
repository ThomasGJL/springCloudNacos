package com.example.service;

import com.example.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2022-08-17
 */
public interface IUserService extends IService<User> {

    List<User> getUserlist();

    User getUserById(int id);

    User saveUser(User user);

    User getAdminUser();
}
