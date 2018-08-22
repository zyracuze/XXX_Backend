package com.example.shopping;

import com.example.shopping.repository.OrdersRepository;
import com.example.shopping.repository.OrderItemsRepository;
import com.example.shopping.service.impl.OrderServiceImpl;
import org.junit.Test;
import com.example.shopping.domain.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.*;
import static org.junit.Assert.assertTrue;

public class OrderServiceTest {

    @InjectMocks
    private OrderServiceImpl orderService;

    @Mock
    private OrdersRepository ordersRepositoryRepository;
    @Mock
    private OrderItemsRepository orderItemsRepositoryRepository;

    @Test
    public void saveOrderSuccess() {

        OrderDetails orderDetails = new OrderDetails();
        Orders orders = new Orders();
        List<Toy> toyList = new ArrayList<Toy>();
        Toy toy1 = new Toy();
        toy1.setQuantity(1);
        toy1.setPrice(24.95);
        toy1.setAvailability("In-Stock");
        toyList.add(toy1);
        Toy toy2 = new Toy();
        toy2.setQuantity(1);
        toy2.setPrice(19.95);
        toy2.setAvailability("In-Stock");
        toyList.add(toy1);
        orders.setFullName("");
        orders.setAddress1("");
        orders.setAddress2("");
        orders.setCity("");
        orders.setProvince("");
        orders.setPostcode("");
        boolean actualResult = orderService.saveOrder(orderDetails);

        assertTrue(actualResult);

    }

}
