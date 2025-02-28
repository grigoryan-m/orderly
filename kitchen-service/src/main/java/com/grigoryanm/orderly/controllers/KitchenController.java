package com.grigoryanm.orderly.controllers;

import com.grigoryanm.orderly.models.KitchenOrder;
import com.grigoryanm.orderly.services.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kitchen")
public class KitchenController {
    @Autowired
    private KitchenService kitchenService;
    @GetMapping("/orders")
    public List<KitchenOrder> getAllOrders(){
        return kitchenService.getAllOrders();
    }
    @GetMapping("/orders/{id}")
    public KitchenOrder getOrderById(@PathVariable String id){
        return kitchenService.getOrderById(id);
    }
    @PutMapping("/orders/{id}/status")
    public KitchenOrder changeStatus(@PathVariable String id, @RequestBody String status){
        return kitchenService.changeStatus(id, status);
    }
    @GetMapping("/orders/{status}")
    public List<KitchenOrder> getOrdersByStatus(@PathVariable String status){
        return kitchenService.getOrdersByStatus(status);
    }
}
