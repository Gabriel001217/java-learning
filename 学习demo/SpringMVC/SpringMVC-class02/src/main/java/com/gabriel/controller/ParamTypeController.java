package com.gabriel.controller;

import com.gabriel.pojo.QueryParm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Controller
@RequestMapping("paramType")
public class ParamTypeController {

    /**
     *参数绑定:
     * 1)默认绑定方式:HttpServletRequest,response,session
     * 2)Model:(返回客户端绑定参数使用)是一个接口,需要在方法参数中声明,绑定到model中的数据可以直接绑定到request对象中返回,
     *          而handler方法只需要返回string逻辑视图名即可
     * 3)ModelMap:Model接口的实现类,同上
     * 4)简单类型:在参数中声明形参的名称和请求中的参数名称相同,那么值就会自动绑定到形参中
     * 5)对象类型:参数中声明pojo对象,对象中的属性名必须和请求参数名相同,如果属性是对象类型,那么只需要请求参数中的名称变为对象名,s
     * 6)自定义类型:比如日期类型,只支持特定格式,如果需要自定义格式,需要自定义参数绑定,自定义一个转换器.
     * 7)数组和集合:
     *            1.简单类型
     *                  数组可以直接绑定参数,集合不能,可以将集合以对象的属性形式出现,可以实现自动绑定
     *            2.javabean类型
     *                  以user[0].name的形式绑定
     */

    @RequestMapping(value = "method01",method = RequestMethod.GET)
    public String method01(HttpServletRequest request){
        System.out.println(request.getParameter("name"));
        return "new";
    }

    @RequestMapping("method02")
    public String method02(Model model){

        model.addAttribute("name", "张三");
        model.addAttribute("age", 20);//自动绑定到request对象中

        return "new";
    }

    @RequestMapping("method03")
    public void method03(String name,Integer age,String sex){
        System.out.println(name+"\n"+age+"\n"+"sex");
    }

    //日期类型的参数
    //输入参数从2020-09-10改为2020/09/10
    @RequestMapping("method06")
    public String method06(Date date){
        System.out.println(date);
        return "new";
    }

    @RequestMapping("method07")
    public String method07(String ids[], QueryParm queryParm){
        System.out.println(Arrays.toString(ids));
        System.out.println(queryParm.getIdList());
        return "new";
    }
}
