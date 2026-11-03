package org.example;

import org.example.context.ATM;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(500);
        atm.withdrawCash(2000);
    }
}