package com.myshop.app.dao;

import com.myshop.app.pojo.Order;

public interface OrderDao {

    Order getOrderById(String orderNumber);

}
