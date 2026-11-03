package org.example.product.concrete;

import org.example.product.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square ");
    }
}
