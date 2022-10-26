package com.study.container.servlet;

import com.study.container.dao.StudentDao;
import com.study.container.daoimpl.DaoFactory;
import com.study.container.pojo.Student;
import com.study.container.util.DatabaseConnectionUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Create extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            resp.setContentType("text/json;charset=UTF-8");
            req.setCharacterEncoding("utf-8");

            String key = req.getParameter("query");
            if(key == null){
                key = "";
            }
            DatabaseConnectionUtil dbc = new DatabaseConnectionUtil();
            StudentDao dao = DaoFactory.getStudentDaoInstance();

            String id = req.getParameter("id");
            String name = req.getParameter("name");
            String birthday = req.getParameter("birthday");
            String major = req.getParameter("major");
            String strScore = req.getParameter("score");
            float score = 0;
            if(strScore==null||"".equals(strScore.trim())){
                score = 0;
            }else{
                score = Float.parseFloat(strScore);
            }
            String telphone = req.getParameter("telphone");

            Student s = new Student();
            s.setId(Integer.parseInt(id));
            s.setName(name);
            s.setBirthday(new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(birthday).getTime()));
            s.setMajor(major);
            s.setScore(score);
            s.setTelphone(telphone);
            dao.doCreate(s);

            out.println("{\"success\":true}");
        } catch (SQLException dke) {
            String msg = "关键字与数据库中的已有记录重复";
            out.print("{\"success\":false,\"errorMsg\":'" + msg + "'}");
        }catch (Exception ex) {
            String msg = ex.getMessage();
            out.print("{\"success\":false,\"errorMsg\":'" + msg + "'}");
        }finally{
            if(out!=null){
                out.close();
            }
        }
    }
}
