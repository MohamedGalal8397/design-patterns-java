package org.example;

public class Main {
    public static void main(String[] args) {


        System.out.println("----------------");
        HotBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("----------------");

        HotBeverage coffee = new Coffee();
        coffee.prepareRecipe();


    }
}