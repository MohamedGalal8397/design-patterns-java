package org.example.state.concrete;

import org.example.context.ATM;
import org.example.state.State;

public class NoCardState implements State {
    private ATM atm;

    public NoCardState(ATM atm) { this.atm = atm; }


    @Override
    public void insertCard() {
        System.out.println("Card inserted.");
        atm.setState(atm.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Insert card first.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Insert card first.");
    }
}
