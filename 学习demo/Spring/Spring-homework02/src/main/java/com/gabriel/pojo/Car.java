package com.gabriel.pojo;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;

@Component("car")
public class Car {

    private String brand;
    private Integer id;
    private String color;
    private double price;
    private Date buyDay;
    private ArrayList<User> list;

    public Car() {
    }

    public Car(String brand, Integer id, String color, double price, Date buyDay, ArrayList<User> list) {
        this.brand = brand;
        this.id = id;
        this.color = color;
        this.price = price;
        this.buyDay = buyDay;
        this.list = list;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getBuyDay() {
        return buyDay;
    }

    public void setBuyDay(Date buyDay) {
        this.buyDay = buyDay;
    }

    public ArrayList<User> getList() {
        return list;
    }

    public void setList(ArrayList<User> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", id=" + id +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", buyDay=" + buyDay +
                ", list=" + list +
                '}';
    }
}
