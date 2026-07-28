package com.panharoth.hexagonalarchitecture.adapter.input.rest;

import com.panharoth.hexagonalarchitecture.adapter.input.rest.mapper.OrderWebMapper;
import com.panharoth.hexagonalarchitecture.domain.dto.FoodOrder;
import com.panharoth.hexagonalarchitecture.domain.dto.FoodOrderRequestDTO;
import com.panharoth.hexagonalarchitecture.domain.dto.FoodOrderResponseDTO;
import com.panharoth.hexagonalarchitecture.domain.port.input.PlaceOrderUseCase;
import com.panharoth.hexagonalarchitecture.domain.port.input.TrackOrderUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final PlaceOrderUseCase placeOrderUseCase;
    private final TrackOrderUseCase trackOrderUseCase;
    private final OrderWebMapper webMapper;

    @PostMapping
    public ResponseEntity<FoodOrderResponseDTO> placeOrder(@RequestBody FoodOrderRequestDTO request) {
        FoodOrder saved = placeOrderUseCase.placeOrder(webMapper.toDomain(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(webMapper.toResponse(saved));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<String> trackOrder(@PathVariable String orderId) {
        return ResponseEntity.ok(trackOrderUseCase.trackOrder(orderId));
    }
}
