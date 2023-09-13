package com.example.designpatternsgof.Creational.Decorator.datasource;

public class CompressionDecorator extends BaseDecorator{
    public CompressionDecorator(Datasource nextLayer) {
        super(nextLayer);
    }

    @Override
    public String read() {
        String compress = nextLayer.read();
        return decompress(compress);
    }

    @Override
    public void write(String value) {
        String compressed = compress(value);
        nextLayer.write(value);
    }

    private String compress(String value) {
        return value + ":" + "compressed";
    }

    private String decompress(String value) {
        return  value + ": decompressed";
    }
}
