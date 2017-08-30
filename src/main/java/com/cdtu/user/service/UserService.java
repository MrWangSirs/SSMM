package com.cdtu.user.service;

import org.springframework.stereotype.Service;

import com.cdtu.user.enty.User;

@Service
public interface UserService {  
    boolean doUserLogin(User user);  
} 