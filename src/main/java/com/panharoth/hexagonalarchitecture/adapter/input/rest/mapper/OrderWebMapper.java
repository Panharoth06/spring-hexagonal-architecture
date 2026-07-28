package com.panharoth.hexagonalarchitecture.adapter.input.rest.mapper;

import com.panharoth.hexagonalarchitecture.domain.dto.FoodOrder;
import com.panharoth.hexagonalarchitecture.domain.dto.FoodOrderRequestDTO;
import com.panharoth.hexagonalarchitecture.domain.dto.FoodOrderResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderWebMapper {

    // request -> domain: orderId + status are assigned later (DB / service), so ignore here
    @Mapping(target = "orderId", ignore = true)
    @Mapping(target = "status", ignore = true)
    FoodOrder toDomain(FoodOrderRequestDTO request);

    // domain -> response: identical field names, direct mapping
    FoodOrderResponseDTO toResponse(FoodOrder order);
}
