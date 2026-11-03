package org.example.decorator;


import org.example.Coffee;

public class WithMilk extends CoffeeDecorator {


    public WithMilk(Coffee coffee) {
        super(coffee);
    }


    @Override
    public double getCost() {
        return super.getCost() + 3;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }
}
