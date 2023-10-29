package com.example.mockito.service;

import com.example.mockito.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User getUserById(Long userId);
}