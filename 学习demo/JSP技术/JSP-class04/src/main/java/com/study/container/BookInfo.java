package com.study.container;

public class BookInfo {
    private String name;
    private String isbn;
    private double price;
    private int paginalNumber;

    public BookInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPaginalNumber() {
        return paginalNumber;
    }

    public void setPaginalNumber(int paginalNumber) {
        this.paginalNumber = paginalNumber;
    }

}