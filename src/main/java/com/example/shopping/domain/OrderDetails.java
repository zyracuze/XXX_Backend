package com.example.shopping.domain;

import java.util.*;

public class OrderDetails {

    private Orders orders;
    private List<Toy> toyList;

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public List<Toy> getToyList() {
        return toyList;
    }

    public void setToyList(List<Toy> toyList) {
        this.toyList = toyList;
    }
}
