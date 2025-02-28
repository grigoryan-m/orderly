package com.grigoryanm.orderly.repositories;

import com.grigoryanm.orderly.models.KitchenOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface KitchenRepository extends MongoRepository<KitchenOrder, String> {
    Optional<KitchenOrder> findKitchenOrderByTableNumber(int tableNumber);
    List<KitchenOrder> findKitchenOrderByStatus(String status);
    Optional<KitchenOrder> findKitchenOrderById(String id);
}
