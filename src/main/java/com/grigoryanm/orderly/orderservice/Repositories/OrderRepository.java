package com.grigoryanm.orderly.orderservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grigoryanm.orderly.orderservice.Models.Order;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
    List<Order> findOrdersByTableNumber(int tableNumber);
}
