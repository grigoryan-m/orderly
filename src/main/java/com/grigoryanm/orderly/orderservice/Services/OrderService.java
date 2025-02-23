package com.grigoryanm.orderly.orderservice.Services;

import com.grigoryanm.orderly.orderservice.Models.Order;
import com.grigoryanm.orderly.orderservice.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    public Order getOrderById(UUID id){
        return orderRepository.findById(id).orElse(null);
    }
    public List<Order> getOrderByTableNumber(int table_number){
        return orderRepository.findOrdersByTableNumber(table_number);
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }
    public void deleteOrderById(UUID id){
        orderRepository.deleteById(id);
    }
    public Order updateOrderStatusById(UUID id, String status){
        Order orderToEdit = orderRepository.findById(id).orElse(null);
        if(orderToEdit != null) {
            orderToEdit.setStatus(status);
            return orderToEdit;
        }
        return null;
    }
}
