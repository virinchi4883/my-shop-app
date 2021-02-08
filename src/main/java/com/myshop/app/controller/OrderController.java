package com.myshop.app.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.myshop.app.pojo.Order;
import com.myshop.app.service.OrderService;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{orderNumber}")
    public ResponseEntity<Order> getOrderDetails(@PathVariable String orderNumber) {
        if (Objects.isNull(orderNumber) || orderNumber.isBlank()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        Order order = orderService.getOrder(orderNumber);
        if (Objects.isNull(order)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(order);
        }
    }

}

