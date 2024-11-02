package com.orderservice.repositories;

import com.orderservice.entities.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<PurchaseOrder,Long> {
}
