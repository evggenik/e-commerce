package com.evggenn.ecommerce.payment;

import com.evggenn.ecommerce.customer.CustomerResponse;
import com.evggenn.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Long orderId,
        String orderReference,
        CustomerResponse customer
) {
}
