package com.example.service.impl;

import com.example.model.User;
import com.example.mapper.UserMapper;
import com.example.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2022-08-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserlist() {
        List<User> userList = userMapper.findAllUser();
        return userList;
    }

    @Transactional
    public User saveUser(User user) {
        userMapper.insert(user);
        return user;
    }


    public User getUserById(int id) {
        User user = userMapper.selectById(id);
        return user;
    }

    @Cacheable(cacheNames = "User", key="'adminUser'")
    public User getAdminUser() {
        User user = userMapper.getAdminUser();
        return user;
    }
}
