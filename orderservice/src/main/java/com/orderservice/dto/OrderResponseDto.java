package com.orderservice.dto;


import com.orderservice.entities.PurchaseOrder;
import com.orderservice.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponseDto {
    private Long userId;
    private Long productId;
    private Long orderId;
    private Long amount;
    private OrderStatus orderStatus;

    public OrderResponseDto(PurchaseOrder order) {

    }
}
