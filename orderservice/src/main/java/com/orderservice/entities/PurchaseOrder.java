package com.orderservice.entities;


import com.orderservice.dto.OrderRequestDto;
import com.orderservice.enums.OrderStatus;
import com.orderservice.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PurchaseOrder {
    @Id
    private Long id;
    private Long userId;
    private Long productId;
    private Long price;
    private OrderStatus orderStatus;
    private PaymentStatus paymentStatus;

    public  PurchaseOrder(OrderRequestDto orderRequest) {
        this.userId = orderRequest.getUserId();
        this.productId = orderRequest.getProductId();
        this.price = orderRequest.getAmount();
        this.orderStatus = OrderStatus.ORDER_COMPLETED;
        this.paymentStatus = PaymentStatus.PAYMENT_COMPLETED;
    }
}
