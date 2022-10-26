package com.gabriel.pojo;

import java.util.Date;

public class Item {

    private Integer id;
    private String name;
    private double price;
    private Date onDay;
    private String detail;

    public Item() {
    }

    public Item(Integer id, String name, double price, Date onDay, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.onDay = onDay;
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getOnDay() {
        return onDay;
    }

    public void setOnDay(Date onDay) {
        this.onDay = onDay;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", onDay=" + onDay +
                ", detail='" + detail + '\'' +
                '}';
    }
}
