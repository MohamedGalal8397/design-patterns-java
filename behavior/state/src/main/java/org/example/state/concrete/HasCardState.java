package org.example.state.concrete;

import org.example.context.ATM;
import org.example.state.State;

public class HasCardState implements State {

    private ATM atm;

    public HasCardState(ATM atm) { this.atm = atm; }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atm.setState(atm.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {

        if (pin == 1234) {
            System.out.println("PIN correct.");
            atm.setState(atm.getHasPinState());
        } else {
            System.out.println("Wrong PIN. Card ejected.");
            atm.setState(atm.getNoCardState());
        }
    }

    @Override
    public void withdrawCash(int amount) {

        System.out.println("Enter PIN first.");
    }
}
