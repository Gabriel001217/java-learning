package com.study.container.servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.study.container.dao.StudentDao;
import com.study.container.daoimpl.DaoFactory;
import com.study.container.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Load extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        try {
            resp.setContentType("text/json;charset=UTF-8");
            req.setCharacterEncoding("utf-8");

            String key = req.getParameter("searchKey");
            if(key == null){
                key = "";
            }
            //分页参数
            int page;
            int rows;
            try {
                page = Integer.parseInt(req.getParameter("page"));
                rows = Integer.parseInt(req.getParameter("rows"));
            } catch (NumberFormatException nfe) {
                page = 1;
                rows = 20;
            }

            StudentDao dao = DaoFactory.getStudentDaoInstance();
            int total = 0;
            total = dao.findAllCount(key);
            List<Student> list = dao.findAll(key,(page-1)*rows,rows);
            //转换成EasyUI接受的JSON格式
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("total", total);
            map.put("rows", list);
            //转换日期格式，
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String result = gson.toJson(map);
            out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
