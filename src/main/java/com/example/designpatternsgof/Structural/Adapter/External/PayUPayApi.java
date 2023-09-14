package com.example.designpatternsgof.Structural.Adapter.External;

public class PayUPayApi {
    public void makePayment(Long id, String name, String email) {
        System.out.println("PayU Payment");
    }

    public PayUPayStatus checkStatus(Long id) {
        return PayUPayStatus.OK;
    }
}
