package com.gabriel.controller;

import com.gabriel.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private List<User> userList=new ArrayList<>();

    @RequestMapping("/regist")
    public String jump(){
        return "regist";
    }

    @RequestMapping("/login")
    public String regist(User user){
        userList.add(user);
        return "login";
    }

    @RequestMapping("/judge")
    public String judge(String username, String password, Model model){
        boolean flag=false;
        for (User user : userList) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())){
                flag=true;
                break;
            }
        }
        model.addAttribute("flag", flag);
        if(flag){
            return "welcome";
        }
        return "login";
    }
}
