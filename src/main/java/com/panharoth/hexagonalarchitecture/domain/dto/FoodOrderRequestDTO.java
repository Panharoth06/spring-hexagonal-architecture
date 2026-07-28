package com.panharoth.hexagonalarchitecture.domain.dto;

import lombok.Builder;

@Builder
public record FoodOrderRequestDTO (
        String customerName,
        String restaurantName,
        String item
)  {
}