package org.example.product.concrete;

import org.example.product.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
