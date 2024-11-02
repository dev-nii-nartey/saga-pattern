package com.orderservice.controllers;


import com.orderservice.dto.OrderRequestDto;
import com.orderservice.dto.OrderResponseDto;
import com.orderservice.services.OrderService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class OrderController {

    private OrderService orderService;

    public OrderResponseDto CreateOrder(@RequestBody OrderRequestDto orderRequest){

    }

}
