package com.example.shopping.service;

import com.example.shopping.domain.Orders;
import com.example.shopping.domain.Toy;

import java.util.List;

public interface OrderService {

    boolean saveOrder(Orders orders, List<Toy> toyList);

}
