package com.gabriel.pojo;

import org.springframework.stereotype.Component;

@Component("user")
public class User {

    private String name;
    private Integer uid;
    private String sex;
    private String email;
    private Integer cid;

    public User() {
    }

    public User( Integer uid,String name, String sex, String email, Integer cid) {
        this.name = name;
        this.uid = uid;
        this.sex = sex;
        this.email = email;
        this.cid = cid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", uid=" + uid +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", cid=" + cid +
                '}';
    }
}
