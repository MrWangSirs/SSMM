package com.cdtu.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdtu.user.enty.User;
import com.cdtu.user.service.impl.UserServiceImpl;

@Controller  
@RequestMapping("/test")   
public class LoginController {  
    @Autowired  
    private UserServiceImpl userService;  
  
@RequestMapping("/dologin.do") //url  
public String dologin(User user, Model model){  
    if(userService.doUserLogin(user)){  
        model.addAttribute("successMsg", "��½�ɹ���");//���ص�ҳ�����д��Ĳ���  
        model.addAttribute("name", user.getUsername());  
        return "/success";//���ص�ҳ��  
    }else{  
        model.addAttribute("failMsg", "�û������ڻ��������");  
        return "/fail";  
    }     
}  
}  