package com.example.designpatternsgof.Structural.Adapter.External;

public class RazorPayApi {
    public void pay(Long id, String name, String email) {
        System.out.println("Razorpay Payment");
    }

    public RazorPayStatus checkStatus(Long id) {
        return RazorPayStatus.OK;
    }
}
