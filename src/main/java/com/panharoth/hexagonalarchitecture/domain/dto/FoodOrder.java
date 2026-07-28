package com.panharoth.hexagonalarchitecture.domain.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class FoodOrder {
    private UUID orderId;
    private String customerName;
    private String restaurantName;
    private String item;
    private String status;

    public void markPlaced() {
        this.status = "ORDER PLACED";
    }
}
