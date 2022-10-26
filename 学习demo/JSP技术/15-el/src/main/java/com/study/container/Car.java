package com.study.container;

public class Car {

    private String brand;
    private Integer id;
    private double price;
    private Integer seats;

    public Car() {
    }

    public Car(String brand, Integer id, double price, Integer seats) {
        this.brand = brand;
        this.id = id;
        this.price = price;
        this.seats = seats;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

}
