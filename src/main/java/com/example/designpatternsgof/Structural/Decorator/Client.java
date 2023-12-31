package com.example.designpatternsgof.Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        Datasource datasource = new FileDataSource();
        Datasource encryptedDb = new EncryptionDecorator(datasource);
        Datasource compressedDb = new CompressionDecorator(encryptedDb);
        String r = compressedDb.read();
        compressedDb.write("JJ");
        System.out.println(r);
    }
}
