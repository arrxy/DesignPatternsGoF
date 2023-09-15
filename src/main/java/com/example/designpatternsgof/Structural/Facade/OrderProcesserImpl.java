package com.example.designpatternsgof.Structural.Facade;

public class OrderProcesserImpl implements OrderProcessor{
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private InvoiceService invoiceService;
    @Override
    public void process(Long orderId) {
        if (!inventoryService.isPresent(orderId)) {
            throw new RuntimeException("Out of Stock");
        }
        paymentService.processPayment();
        invoiceService.processInvoice();

    }
}
