package com.panharoth.hexagonalarchitecture.adapter.output.mapper;

import com.panharoth.hexagonalarchitecture.adapter.output.entity.OrderEntity;
import com.panharoth.hexagonalarchitecture.domain.dto.FoodOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderPersistenceMapper {

    // domain -> entity (orderId maps to id; null on new orders, so the DB generates it)
    @Mapping(target = "id", source = "orderId")
    OrderEntity toEntity(FoodOrder foodOrder);

    // entity -> domain
    @Mapping(target = "orderId", source = "id")
    FoodOrder toOrder(OrderEntity orderEntity);

    List<FoodOrder> toDomainList(List<OrderEntity> entities);
}
