package com.gabriel.service.Impl;

import com.gabriel.mapper.OrderMapper;
import com.gabriel.pojo.Order;
import com.gabriel.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public int addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    public List<Order> queryOrders() {
        return orderMapper.queryOrders();
    }
}
