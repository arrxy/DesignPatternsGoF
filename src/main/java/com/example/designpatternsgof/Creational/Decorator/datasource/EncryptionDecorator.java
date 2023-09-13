package com.example.designpatternsgof.Creational.Decorator.datasource;

public class EncryptionDecorator extends BaseDecorator {
    public EncryptionDecorator(Datasource nextLayer) {
        super(nextLayer);
    }

    @Override
    public String read() {
        String value = nextLayer.read();
        return decrypt(value);
    }

    @Override
    public void write(String value) {
        String encrypted = encrypt(value);
        nextLayer.write(value);
    }

    public String encrypt(String value) {
        return value + ":" + value;
    }

    public String decrypt(String value) {
        return value + ":" + "decrypted";
    }
}
