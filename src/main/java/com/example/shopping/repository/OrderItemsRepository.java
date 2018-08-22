package com.example.shopping.repository;

import com.example.shopping.domain.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository <OrderItems, Integer> {
}
