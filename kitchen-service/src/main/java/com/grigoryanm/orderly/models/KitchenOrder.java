package com.grigoryanm.orderly.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "kitchen-orders")
@Data
public class KitchenOrder {
    @Id
    private String id;

    @Field("table_number")
    private int tableNumber;
    private String status;

    @Field("created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
    @Field("updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();
}
