package com.myshop.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.app.dao.OrderDao;
import com.myshop.app.pojo.Order;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order getOrder(String orderNumber) {
        return orderDao.getOrderById(orderNumber);
    }
}
