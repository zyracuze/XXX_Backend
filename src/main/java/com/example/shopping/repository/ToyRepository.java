package com.example.shopping.repository;

import com.example.shopping.domain.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepository extends JpaRepository<Toy, Integer> {
}
