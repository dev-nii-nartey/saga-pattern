package com.orderservice.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderRequestDto {

    private Long userId;
    private Long productId;
    private Long orderId;
    private Long amount;
}
