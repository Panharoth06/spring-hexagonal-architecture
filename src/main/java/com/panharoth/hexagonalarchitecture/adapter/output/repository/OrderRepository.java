package com.panharoth.hexagonalarchitecture.adapter.output.repository;

import com.panharoth.hexagonalarchitecture.adapter.output.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {
}
