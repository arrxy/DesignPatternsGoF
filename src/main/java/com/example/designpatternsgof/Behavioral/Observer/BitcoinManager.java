package com.example.designpatternsgof.Behavioral.Observer;

public class BitcoinManager extends Publisher{
    private Bitcoin bitcoin;

    public void setPrice(Double price) {
        bitcoin.setPrice(price);
        publish(price);
    }

}