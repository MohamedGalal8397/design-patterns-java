package org.example.state.concrete;

import org.example.context.ATM;
import org.example.state.State;

public class NoCashState implements State {

    private ATM atm;

    public NoCashState(ATM atm) { this.atm = atm; }

    @Override
    public void insertCard() {
        System.out.println("No card available.");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card inserted.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("No cash available.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("No cash available.");
    }
}
