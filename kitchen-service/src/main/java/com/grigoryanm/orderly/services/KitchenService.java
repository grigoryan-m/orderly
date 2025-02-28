package com.grigoryanm.orderly.services;

import com.grigoryanm.orderly.models.KitchenOrder;
import com.grigoryanm.orderly.repositories.KitchenRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KitchenService {
    private final KitchenRepository kitchenRepository;

    public KitchenService(KitchenRepository kitchenRepository){
        this.kitchenRepository = kitchenRepository;
    }

    public List<KitchenOrder> getAllOrders(){
        return kitchenRepository.findAll();
    }
    public KitchenOrder getOrderByTableNumber(int tableNumber){
        return kitchenRepository.findKitchenOrderByTableNumber(tableNumber).orElse(null);
    }
    public List<KitchenOrder> getOrdersByStatus(String status){
        return kitchenRepository.findKitchenOrderByStatus(status);
    }
    public KitchenOrder getOrderById(String id){
        return kitchenRepository.findKitchenOrderById(id).orElse(null);
    }
    public KitchenOrder changeStatus(String id, String status){
        KitchenOrder orderToChange = kitchenRepository.findKitchenOrderById(id).orElse(null);
        if(orderToChange == null) return null;
        orderToChange.setStatus(status);
        return orderToChange;
    }

}
