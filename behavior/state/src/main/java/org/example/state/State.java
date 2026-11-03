package org.example.state;

public interface State {

    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void withdrawCash(int amount);

}
