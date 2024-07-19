package com.evggenn.ecommerce.kafka;

import com.evggenn.ecommerce.customer.CustomerResponse;
import com.evggenn.ecommerce.order.PaymentMethod;
import com.evggenn.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
