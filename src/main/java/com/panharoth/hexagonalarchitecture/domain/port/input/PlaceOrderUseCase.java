package com.panharoth.hexagonalarchitecture.domain.port.input;

import com.panharoth.hexagonalarchitecture.domain.dto.FoodOrder;

public interface PlaceOrderUseCase {

    FoodOrder placeOrder(FoodOrder foodOrder);

}
