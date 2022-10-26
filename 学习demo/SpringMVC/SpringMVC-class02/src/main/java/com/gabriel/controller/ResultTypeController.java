package com.gabriel.controller;

import com.gabriel.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("returnType")
public class ResultTypeController {

    /**
     * 返回值:
     *      1)返回ModelAndView
     *      2)返回void
     *        在处理器内部直接实现跳转:转发,重定向
     *      3)返回string
     *        1.返回逻辑视图名,相当于执行了转发操作
     *        2.临时跳转
     *          如果需要临时跳转,不经过视图解析器,可以在路径前追加"forward:"或"redirect:"
     *      4)返回对象(json)
     *        支持json
     *
     */

    @RequestMapping("method01")
    public String method01(){
        return "redirect:http://www.baidu.com";
    }

    @RequestMapping("method02")
    public ModelAndView method02(){
        ModelAndView mv=new ModelAndView();
        RedirectView rv=new RedirectView("http://www.baidu.com");
        mv.setView(rv);
        return mv;
    }

    @RequestMapping("method03")
    @ResponseBody
    public List<User> method03(){
        List<User> users=new ArrayList<User>();
        User user=null;
        for (int i=1;i<=10;i++){
            user=new User();
            user.setName("tom"+i);
            user.setAge(20+i);
            users.add(user);
        }
        return users;
    }
}
