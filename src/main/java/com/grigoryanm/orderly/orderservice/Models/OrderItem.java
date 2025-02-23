package com.grigoryanm.orderly.orderservice.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Table(name="order_items")
@Entity
public class OrderItem {
    @Id
    private UUID id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="order_id")
    private Order order;
    private String name;
    private int quantity;
    @Column(name="price_for_each")
    private float priceForEach;
    private float total;
}
