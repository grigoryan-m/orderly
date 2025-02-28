package com.grigoryanm.orderly.controllers;

import com.grigoryanm.orderly.Models.Order;
import com.grigoryanm.orderly.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/orders")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order PostOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }
    @GetMapping
    public List<Order> GetAllOrders(){
        return orderService.getAllOrders();
    }
    @GetMapping("/{id}")
    public Order GetOrderById(@PathVariable UUID id){
        return orderService.getOrderById(id);
    }
    @PutMapping("/{id}/status")
    public String UpdateOrderStatus(@PathVariable UUID id, @RequestParam(value="status", required=true) String status){
        return orderService.updateOrderStatusById(id, status);
    }
    @DeleteMapping("/{id}")
    public void DeleteOrder(@PathVariable UUID id){
        orderService.deleteOrderById(id);
    }
}
