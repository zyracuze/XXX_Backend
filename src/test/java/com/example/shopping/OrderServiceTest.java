package com.example.shopping;

import com.example.shopping.domain.Order;
import com.example.shopping.domain.Result;
import org.junit.Test;
import service.OrderService;

import static org.junit.Assert.assertEquals;

public class OrderServiceTest {

    private OrderService orderService;

    @Test
    public void saveOrderSuccess() {

        Result expectedResult = new Result();
        expectedResult.setSuccess

        Order order = new Order();
        Result actualResult = orderService.saveOrder(order);

        assertEquals(expectedResult, actualResult);

    }

}
