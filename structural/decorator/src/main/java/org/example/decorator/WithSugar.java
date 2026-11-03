package org.example.decorator;


import org.example.Coffee;

public class WithSugar extends CoffeeDecorator {


    public WithSugar(Coffee coffee) {
        super(coffee);
    }


    @Override
    public double getCost() {
        return super.getCost() + 2;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
