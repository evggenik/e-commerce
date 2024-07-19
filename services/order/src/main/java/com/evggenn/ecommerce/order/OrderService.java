package com.evggenn.ecommerce.order;

import com.evggenn.ecommerce.customer.CustomerClient;
import com.evggenn.ecommerce.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CustomerClient customerClient;
    //private final ProductClient productClient;

    public Long createOrder(OrderRequest request) {
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException("Cannot create order:: No customer exists with the provided ID"));

        return null;
    }
}
