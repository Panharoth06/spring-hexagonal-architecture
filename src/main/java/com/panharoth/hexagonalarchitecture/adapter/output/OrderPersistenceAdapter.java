package com.panharoth.hexagonalarchitecture.adapter.output;

import com.panharoth.hexagonalarchitecture.adapter.output.entity.OrderEntity;
import com.panharoth.hexagonalarchitecture.adapter.output.mapper.OrderPersistenceMapper;
import com.panharoth.hexagonalarchitecture.adapter.output.repository.OrderRepository;
import com.panharoth.hexagonalarchitecture.domain.dto.FoodOrder;
import com.panharoth.hexagonalarchitecture.domain.port.output.OrderRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Repository
public class OrderPersistenceAdapter implements OrderRepositoryPort {

    private final OrderRepository orderRepository;
    private final OrderPersistenceMapper mapper;

    @Override
    public FoodOrder saveOrder(FoodOrder foodOrder) {
        OrderEntity saved = orderRepository.save(mapper.toEntity(foodOrder));
        return mapper.toOrder(saved);
    }

    @Override
    public Optional<FoodOrder> findOrderByUUID(UUID uuid) {
        return orderRepository.findById(uuid).map(mapper::toOrder);
    }

    @Override
    public List<FoodOrder> findAllOrders() {
        return mapper.toDomainList(orderRepository.findAll());
    }
}
