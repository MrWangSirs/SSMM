package com.cdtu.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cdtu.user.dao.UserDao;
import com.cdtu.user.enty.User;
import com.cdtu.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	

    private UserDao<User> dao;  
    
    @Override
    public boolean doUserLogin(User user) {  
        List<User> list = dao.selectId(user.getUsername());  
        if(list.size() == 0){  
            return false;  
        }else{  
            if(list.get(0).getPassword().equals(user.getPassword())){                 
                return true;  
            }else{  
                return false;  
            }             
        }  
    }     
}  
