package com.example.designpatternsgof.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private List<Consumer> consumers = new ArrayList<>();

    public void publish(Double price) {
        consumers.forEach(consumer -> consumer.consume(price));
    }

    public void addConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    public void removeConsumer(Consumer consumer) {
        consumers.remove(consumer);
    }
}
