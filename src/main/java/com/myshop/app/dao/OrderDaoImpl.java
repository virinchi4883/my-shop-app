package com.myshop.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.myshop.app.pojo.Order;

@Component
public class OrderDaoImpl implements OrderDao {

    @Value("${service.order.get}")
    private String orderGetUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Order getOrderById(String orderNumber) {
        try {
            ResponseEntity<Order> responseEntity = restTemplate.getForEntity(orderGetUrl + "/" + orderNumber, Order.class);
            if (responseEntity.getStatusCode() == HttpStatus.OK) {
                return responseEntity.getBody();
            }
        } catch (HttpClientErrorException e) {
            // Do nothing at this point
        }
        return null;
    }
}
