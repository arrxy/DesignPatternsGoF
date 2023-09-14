package com.example.designpatternsgof.Structural.Adapter;

import com.example.designpatternsgof.Structural.Adapter.External.PayUPayApi;
import com.example.designpatternsgof.Structural.Adapter.External.PayUPayStatus;

public class PayUAdapter implements PaymentProvider{

    private PayUPayApi payUPayApi = new PayUPayApi();
    @Override
    public void createPayment(PaymentRequest paymentRequestt) {
        payUPayApi.makePayment(paymentRequestt.getId(), paymentRequestt.getName(), paymentRequestt.getEmail());
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        PayUPayStatus status = payUPayApi.checkStatus(id);
        return to(status);
    }

    private PaymentStatus to(PayUPayStatus status) {
        switch (status) {
            case OK: return PaymentStatus.DONE;
            case ERROR: return PaymentStatus.ERROR;
        }
        throw new IllegalArgumentException("Invalid status: " + status);
    }
}
