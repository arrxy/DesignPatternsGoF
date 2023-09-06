package com.example.designpatternsgof.Creational.Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.builder()
                .setName("Kiran")
                .setAge(23)
                .setEmail("kiran@email.com")
                .build();
    }
}
