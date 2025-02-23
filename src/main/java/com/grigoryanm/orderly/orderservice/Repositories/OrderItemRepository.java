package com.grigoryanm.orderly.orderservice.Repositories;

import com.grigoryanm.orderly.orderservice.Models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {
}
