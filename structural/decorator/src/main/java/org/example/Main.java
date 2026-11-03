package org.example;


import org.example.decorator.SimpleCoffee;
import org.example.decorator.WithMilk;
import org.example.decorator.WithSugar;

public class Main {
    public static void main(String[] args) {
        System.out.println("___________________________________________________________");
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new WithSugar(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new WithMilk(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
        System.out.println("___________________________________________________________");



    }
}