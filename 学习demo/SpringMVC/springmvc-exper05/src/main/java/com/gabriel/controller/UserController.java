package com.gabriel.controller;

import com.gabriel.pojo.Item;
import com.gabriel.pojo.Order;
import com.gabriel.pojo.User;
import com.gabriel.service.AdminService;
import com.gabriel.service.ItemService;
import com.gabriel.service.OrderService;
import com.gabriel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private OrderService orderService;

    @RequestMapping("jump")
    public String jumpTo() {
        return "regist";
    }

    @RequestMapping("regist")
    public String regist(User user) {
        int result = userService.addUser(user);
        return "login";
    }

    @RequestMapping("login")
    public String loginMethod() {
        return "login";
    }

    @RequestMapping("judge")
    public String judgeMethod(String username, String password, Model model) {

        boolean flag = false;
        if (userService.queryUser(username, password) != null) {

            List<Item> items = itemService.queryItems();
            //绑定查询结果集
            model.addAttribute("username", username);
            model.addAttribute("itemList", items);
            return "welcome";

        } else if (adminService.queryAdmin(username, password) != null) {
            return "manager";
        } else {
            model.addAttribute("flag", flag);
            return "login";
        }
    }

    @RequestMapping("purchase")
    public String purchaseMethod(String username, String itemName, String number, String price, String buy) {
        Integer count = Integer.parseInt(number);
        double total = (Double.parseDouble(price)) * count;
        Date buytime = new Date();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
            buytime = simpleDateFormat.parse(buytime.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Order order = new Order();
        order.setUsername(username);
        order.setItemname(itemName);
        order.setNumber(count);
        order.setBuytime(buytime);
        order.setTotal(total);

        int result = orderService.addOrder(order);
        return "welcome";
    }
}
