package com.gabriel.controller;

import com.gabriel.pojo.Item;
import com.gabriel.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/itemList")
    public ModelAndView queryItemList() {
        List<Item> items = itemService.queryItems();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemList", items);

        modelAndView.setViewName("itemList");

        return modelAndView;
    }

//    @RequestMapping("/itemEdit")
//    public ModelAndView queryItemById(HttpServletRequest request) {
//        // 从request中获取请求参数
//        String strId = request.getParameter("id");
//        Integer id = Integer.valueOf(strId);
//
//        // 根据id查询商品数据
//        Item item = itemService.queryItemById(id);
//
//        // 把结果传递给页面
//        ModelAndView modelAndView = new ModelAndView();
//        // 把商品数据放在模型中
//        modelAndView.addObject("item", item);
//        // 设置逻辑视图
//        modelAndView.setViewName("itemEdit");
//
//        return modelAndView;
//    }
//
//    @RequestMapping("/itemEdit")
//    public String queryItemByid(int id, ModelMap modelMap) {
//        // 根据id查询商品数据
//        Item item = this.itemService.queryItemById(id);
//
//        // 把商品数据放在模型中
//        modelMap.addAttribute("item", item);
//
//        return "itemEdit";
//    }
//
    @RequestMapping("/itemEdit")
    public String queryItemById(@RequestParam(value = "id") Integer itemId, ModelMap modelMap) {
        // 根据id查询商品数据
        Item item = this.itemService.queryItemById(itemId);

        // 把商品数据放在模型中
        modelMap.addAttribute("item", item);

        return "itemEdit";
    }

    @RequestMapping("/update")
    public String updateItem(Item item){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyy-MM-dd");
        try {
            Date onDay= simpleDateFormat.parse(String.valueOf(item.getOnDay()));
            item.setOnDay(onDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        itemService.updateItem(item);
        return "success";
    }
}
