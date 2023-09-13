package com.example.designpatternsgof.Creational.Decorator.datasource;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BaseDecorator implements Datasource {
    protected Datasource nextLayer;
}
