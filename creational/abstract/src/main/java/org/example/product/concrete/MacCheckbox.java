package org.example.product.concrete;

import org.example.product.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Mac Checkbox");
    }
}
