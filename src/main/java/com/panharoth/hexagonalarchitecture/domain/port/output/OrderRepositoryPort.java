package com.panharoth.hexagonalarchitecture.domain.port.output;

import com.panharoth.hexagonalarchitecture.domain.dto.FoodOrder;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderRepositoryPort {

    FoodOrder saveOrder(FoodOrder foodOrder);
    Optional<FoodOrder> findOrderByUUID(UUID uuid);
    List<FoodOrder> findAllOrders();

}
