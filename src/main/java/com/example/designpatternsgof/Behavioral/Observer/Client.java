package com.example.designpatternsgof.Behavioral.Observer;

public class Client {
    public static void main(String[] args) {
        Bitcoin bitcoin = new Bitcoin(100.0);
        BitcoinManager bitcoinManager = new BitcoinManager(bitcoin);
        bitcoinManager.addConsumer(new EmailConsumer());
        bitcoinManager.addConsumer(new SmsConsumer());

        bitcoinManager.setPrice(90.0);
    }
}
