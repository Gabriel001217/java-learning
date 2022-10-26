package com.gabriel.pojo;

public class Admin {

    private String adminname;
    private String realname;
    private String password;
    private Integer phone;

    public Admin() {
    }

    public Admin(String adminname, String realname, String password, Integer phone) {
        this.adminname = adminname;
        this.realname = realname;
        this.password = password;
        this.phone = phone;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminname='" + adminname + '\'' +
                ", realname='" + realname + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                '}';
    }
}
