package com.gabriel.controller;

import com.gabriel.pojo.Item;
import com.gabriel.pojo.Order;
import com.gabriel.pojo.User;
import com.gabriel.service.ItemService;
import com.gabriel.service.OrderService;
import com.gabriel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private UserService userService;

    //跳转到管理员界面
    @RequestMapping("manager")
    public String jumpToManager() {
        return "manager";
    }

    //跳转到订单管理界面
    @RequestMapping("order")
    public String jumpToOrder(Model model) {

        List<Order> orderList = orderService.queryOrders();
        model.addAttribute("orderList", orderList);
        return "orderList";
    }

    //跳转到商品管理界面
    @RequestMapping("item")
    public String jumpToItem(Model model) {

        List<Item> itemList = itemService.queryItems();
        model.addAttribute("itemList", itemList);
        return "itemList";
    }

    //跳转到用户管理界面
    @RequestMapping("user")
    public String jumpToUser(Model model) {

        List<User> userList = userService.queryAll();
        model.addAttribute("userList", userList);
        return "userList";
    }

    //跳转商品修改页面
    @RequestMapping("itemUpdate")
    public String updateItem(Item item, Model model) {

        model.addAttribute("item", item);
        return "updateItem";
    }

    //实现商品修改
    @RequestMapping("doItemUpdate")
    public String doItemUpdate(Item item, Model model) {
        int result = itemService.updateItem(item);
        List<Item> itemList = itemService.queryItems();
        model.addAttribute("itemList", itemList);
        return "itemList";
    }

    //商品删除
    @RequestMapping("itemDel")
    public String delItem(String id, Model model) {
        Integer itemId = Integer.parseInt(id);
        int result = itemService.delItem(itemId);

        List<Item> itemList = itemService.queryItems();
        model.addAttribute("itemList", itemList);
        return "itemList";
    }

    //跳转用户修改页面
    @RequestMapping("userUpdate")
    public String updateUser(User user,Model model){
        model.addAttribute("user", user);
        return "updateUser";
    }

    //实现用户信息修改
    @RequestMapping("doUserUpdate")
    public String doUserUpdate(User user,Model model){
        int result=userService.updateUser(user);
        List<User> userList = userService.queryAll();
        model.addAttribute("userList", userList);
        return "userList";
    }

    //实现用户信息删除
    @RequestMapping("delUser")
    public String delUser(String username,Model model){
        int result=userService.delUser(username);

        List<User> userList = userService.queryAll();
        model.addAttribute("userList", userList);
        return "userList";
    }
}
