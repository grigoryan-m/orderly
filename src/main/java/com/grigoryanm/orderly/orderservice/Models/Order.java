package com.grigoryanm.orderly.orderservice.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="orders")
public class Order {
    @Id
    private UUID id;
    @Column(name="table_number")
    private int tableNumber;
    private String status;
    private float total;
    @Column(name="created_at")
    private LocalDateTime createdAt;
    @Column(name="updated_at")
    private LocalDateTime updatedAt;

}
