package com.example.designpatternsgof.Behavioral.Observer;

public class EmailConsumer implements  Consumer{

    @Override
    public void consume(Double price) {
        System.out.println("Email for price change:: " + price);
    }
}
