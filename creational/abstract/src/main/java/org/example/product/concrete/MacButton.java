package org.example.product.concrete;

import org.example.product.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
