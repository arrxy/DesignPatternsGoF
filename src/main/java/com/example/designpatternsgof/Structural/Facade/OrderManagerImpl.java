package com.example.designpatternsgof.Structural.Facade;

public class OrderManagerImpl implements OrderManager{
    private OrderProcessor orderProcessor = new OrderProcesserImpl();
    @Override
    public void checkout(Long orderId) {
        orderProcessor.process(orderId);

    }
}
