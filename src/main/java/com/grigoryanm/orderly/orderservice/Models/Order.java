package com.grigoryanm.orderly.orderservice.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.IdGeneratorType;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name="table_number")
    private int tableNumber;
    private String status;
    private float total;
    @Column(name="created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
    @Column(name="updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

}
