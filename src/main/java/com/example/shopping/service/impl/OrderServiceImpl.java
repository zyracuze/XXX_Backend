package com.example.shopping.service.impl;

import com.example.shopping.domain.Orders;
import com.example.shopping.domain.OrderItems;
import com.example.shopping.domain.Toy;
import com.example.shopping.repository.OrderItemsRepository;
import com.example.shopping.repository.ToyRepository;
import com.example.shopping.repository.OrdersRepository;
import com.example.shopping.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService{

    private OrdersRepository ordersRepository;
    private OrderItemsRepository orderItemsRepository;


    public OrderServiceImpl(OrdersRepository ordersRepository, OrderItemsRepository orderItemsRepository) {
        this.ordersRepository = ordersRepository;
        this.orderItemsRepository = orderItemsRepository;
    }

    @Override
    public boolean saveOrder(Orders orders, List<Toy> toyList) {

        Orders saveOrder = ordersRepository.save(orders);

        for (Toy toy : toyList) {
            OrderItems orderItems = new OrderItems();
            orderItems.setOrder_id(saveOrder.getId());
            orderItems.setProduct_id(toy.getId());
            orderItems.setQuantity(toy.getQuantity());
            orderItemsRepository.save(orderItems);
        }

        return true;
    }




}
