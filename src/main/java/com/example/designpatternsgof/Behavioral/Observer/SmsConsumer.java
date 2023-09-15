package com.example.designpatternsgof.Behavioral.Observer;

public class SmsConsumer implements Consumer {
    @Override
    public void consume(Double price) {
        System.out.println("Sms :: "+ price);
    }
}
