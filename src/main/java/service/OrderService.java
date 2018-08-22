package service;

import com.example.shopping.domain.Order;
import com.example.shopping.domain.Result;

public interface OrderService {
    Result saveOrder(Order order);
}
