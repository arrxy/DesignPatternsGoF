package com.example.designpatternsgof.Structural.Adapter;

public interface PaymentProvider {
    void createPayment(PaymentRequest paymentRequest);

    PaymentStatus verifyStatus(Long id);
}
