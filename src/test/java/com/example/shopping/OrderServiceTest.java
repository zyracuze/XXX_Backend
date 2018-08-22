package com.example.shopping;

import com.example.shopping.domain.Order;
import org.junit.Test;
import service.OrderService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderServiceTest {

    private OrderService orderService;

    @Test
    public void saveOrderSuccess() {

        Order order = new Order();
        List<Toy> toyList = new ArrayList<Toy>();
        Toy toy = new Toy();
        toyList.add(toy);
        ShippingDetail shipping = new ShippingDetail();
        shipping.setFullName();
        shipping.setAddress1();
        shipping.setAddress2();
        shipping.setCity();
        shipping.setProvince();
        shipping.setPostCode();
        order.setShippingDetail(shipping);
        order.setToyList(toyList);
        boolean actualResult = orderService.saveOrder(order);

        assertTrue(actualResult);

    }

}
