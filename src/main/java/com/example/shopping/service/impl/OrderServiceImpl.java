package com.example.shopping.service.impl;

import com.example.shopping.domain.OrderDetails;
import com.example.shopping.domain.Orders;
import com.example.shopping.domain.OrderItems;
import com.example.shopping.domain.Toy;
import com.example.shopping.repository.OrderItemsRepository;
import com.example.shopping.repository.OrdersRepository;
import com.example.shopping.service.OrderService;


public class OrderServiceImpl implements OrderService{

    private OrdersRepository ordersRepository;
    private OrderItemsRepository orderItemsRepository;


    public OrderServiceImpl(OrdersRepository ordersRepository, OrderItemsRepository orderItemsRepository) {
        this.ordersRepository = ordersRepository;
        this.orderItemsRepository = orderItemsRepository;
    }

    @Override
    public boolean saveOrder(OrderDetails orderDetails) {

        Orders saveOrder = ordersRepository.save(orderDetails.getOrders());

        for (Toy toy : orderDetails.getToyList()) {
            OrderItems orderItems = new OrderItems();
            orderItems.setOrder_id(saveOrder.getId());
            orderItems.setProduct_id(toy.getId());
            orderItems.setQuantity(toy.getQuantity());
            orderItemsRepository.save(orderItems);
        }

        return true;
    }




}
