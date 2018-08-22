package service;

import com.example.shopping.domain.Order;

public interface OrderService {
    boolean saveOrder(Order order);
}
