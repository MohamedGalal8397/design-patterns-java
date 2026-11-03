package org.example.product.concrete;

import org.example.product.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Windows Checkbox");
    }
}
