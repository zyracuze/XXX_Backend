package com.example.shopping;

import org.junit.Test;
import com.example.shopping.service.OrderService;
import com.example.shopping.domain.*;

import java.util.*;
import static org.junit.Assert.assertTrue;

public class OrderServiceTest {

    private OrderService orderService;

    @Test
    public void saveOrderSuccess() {

        Orders orders = new Orders();
        List<Toy> toyList = new ArrayList<Toy>();
        Toy toy = new Toy();
        toyList.add(toy);
        orders.setFull_name("");
        orders.setAddress1("");
        orders.setAddress2("");
        orders.setCity("");
        orders.setProvince("");
        orders.setPostcode("");
        boolean actualResult = orderService.saveOrder(orders, toyList);

        assertTrue(actualResult);

    }

}
