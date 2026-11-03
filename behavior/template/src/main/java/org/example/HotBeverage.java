package org.example;

public abstract class HotBeverage {


    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Steps that subclasses will implement
    protected abstract void brew();
    protected abstract void addCondiments();
}
