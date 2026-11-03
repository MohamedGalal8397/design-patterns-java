package org.example.decorator;

import org.example.Coffee;

public class SimpleCoffee implements Coffee {


    @Override
    public double getCost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}
