package com.gabriel.mapper;

import com.gabriel.pojo.Order;

import java.util.List;

public interface OrderMapper {

    int addOrder(Order order);

    List<Order> queryOrders();
}
