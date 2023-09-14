package com.example.designpatternsgof.Structural.Adapter;

import com.example.designpatternsgof.Structural.Adapter.External.RazorPayApi;
import com.example.designpatternsgof.Structural.Adapter.External.RazorPayStatus;

public class RazorPayAdapter implements PaymentProvider {
    private RazorPayApi razorPayApi = new RazorPayApi();
    @Override
    public void createPayment(PaymentRequest paymentRequest) {
        razorPayApi.pay(paymentRequest.getId(), paymentRequest.getName(), paymentRequest.getEmail());
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        RazorPayStatus status = razorPayApi.checkStatus(id);
        return to(status);
    }

    private PaymentStatus to(RazorPayStatus status) {
        switch (status) {
            case OK: return PaymentStatus.DONE;
            case ERROR: return PaymentStatus.ERROR;
        }
        throw new IllegalArgumentException("Invalid status: " + status);
    }
}
