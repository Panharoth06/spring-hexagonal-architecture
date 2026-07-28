package com.panharoth.hexagonalarchitecture.domain.service;

import com.panharoth.hexagonalarchitecture.domain.dto.FoodOrder;
import com.panharoth.hexagonalarchitecture.domain.port.input.PlaceOrderUseCase;
import com.panharoth.hexagonalarchitecture.domain.port.input.TrackOrderUseCase;
import com.panharoth.hexagonalarchitecture.domain.port.output.OrderRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements PlaceOrderUseCase, TrackOrderUseCase {

    private final OrderRepositoryPort orderRepositoryPort;

    @Override
    public FoodOrder placeOrder(FoodOrder foodOrder) {
        foodOrder.markPlaced();                        // business rule
        return orderRepositoryPort.saveOrder(foodOrder);
    }

    @Override
    public String trackOrder(String orderID) {
        return "";
    }
}
