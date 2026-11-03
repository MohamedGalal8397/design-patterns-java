package org.example.state.concrete;

import org.example.context.ATM;
import org.example.state.State;

public class HasPinState implements State {

    private ATM atm;

    public HasPinState(ATM atm) { this.atm = atm; }


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
        System.out.println("PIN already entered.");
    }

    @Override
    public void withdrawCash(int amount) {
        if (atm.getCash() >= amount) {
            System.out.println("Dispensing " + amount + " cash.");
            atm.setCash(atm.getCash() - amount);
            if (atm.getCash() <= 0) {
                atm.setState(atm.getNoCashState());
            }
        } else {
            System.out.println("Not enough cash.");
            atm.setState(atm.getNoCashState());
        }
    }
}
