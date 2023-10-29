package com.example.mockito.service;

import com.example.mockito.entity.User;

public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Long userId) {
        // 实际的实现，可以从数据库或其他数据源中获取用户信息
        // 这里仅提供一个简单的示例
        User user = new User();
        user.setId(userId);
        user.setUsername("realUser");
        return user;
    }
}
