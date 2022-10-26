package com.gabriel.service;

import com.gabriel.pojo.Order;

import java.util.List;

public interface OrderService {

    int addOrder(Order order);

    List<Order> queryOrders();
}
