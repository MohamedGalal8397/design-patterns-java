package org.example.context;

import org.example.state.State;
import org.example.state.concrete.HasCardState;
import org.example.state.concrete.HasPinState;
import org.example.state.concrete.NoCardState;
import org.example.state.concrete.NoCashState;

public class ATM {

    private State currentState;
    private State noCardState;
    private State hasCardState;
    private State hasPinState;
    private State noCashState;
    private int cash = 2000;

    public ATM() {
        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        hasPinState = new HasPinState(this);
        noCashState = new NoCashState(this);

        currentState = noCardState; // initial state
    }

    // delegate to current state
    public void insertCard() { currentState.insertCard(); }
    public void ejectCard() { currentState.ejectCard(); }
    public void enterPin(int pin) { currentState.enterPin(pin); }
    public void withdrawCash(int amount) { currentState.withdrawCash(amount); }

    // getters and setters
    public void setState(State state) { this.currentState = state; }
    public State getNoCardState() { return noCardState; }
    public State getHasCardState() { return hasCardState; }
    public State getHasPinState() { return hasPinState; }
    public State getNoCashState() { return noCashState; }
    public int getCash() { return cash; }
    public void setCash(int cash) { this.cash = cash; }

}
