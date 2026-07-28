package com.panharoth.hexagonalarchitecture.domain.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record FoodOrderResponseDTO(
        UUID orderId,
        String customerName,
        String restaurantName,
        String item,
        String status
) {
}
