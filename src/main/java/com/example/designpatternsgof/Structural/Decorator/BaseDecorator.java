package com.example.designpatternsgof.Structural.Decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BaseDecorator implements Datasource {
    protected Datasource nextLayer;
}
