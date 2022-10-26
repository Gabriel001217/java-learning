package com.gabriel.pojo;

import java.util.Date;

public class Order {

    private String username;
    private String itemname;
    private Integer number;
    private Date buytime;
    private double total;

    public Order() {
    }

    public Order(String username, String itemname, Integer number, Date buytime, double total) {
        this.username = username;
        this.itemname = itemname;
        this.number = number;
        this.buytime = buytime;
        this.total = total;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "username='" + username + '\'' +
                ", itemname='" + itemname + '\'' +
                ", number=" + number +
                ", buytime=" + buytime +
                ", total=" + total +
                '}';
    }
}
