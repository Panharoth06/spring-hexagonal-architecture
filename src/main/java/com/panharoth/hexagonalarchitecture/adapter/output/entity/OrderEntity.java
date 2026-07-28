package com.panharoth.hexagonalarchitecture.adapter.output.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "orders")
@Data
public class OrderEntity {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String customerName;
    private String restaurantName;
    private String item;
    private String status;
}
