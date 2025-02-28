package com.grigoryanm.orderly.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "kitchen-order-items")
@Data
public class KitchenOrderItem {
    @Id
    private String id;

    @DBRef
    private KitchenOrder order;

    private String name;
    private int quantity;
}
