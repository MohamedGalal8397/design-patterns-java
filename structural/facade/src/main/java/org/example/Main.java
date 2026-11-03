package org.example;


import org.example.facade.ComputerFacade;

public class Main {
    public static void main(String[] args) {

        System.out.println("________________________________________");
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        System.out.println("________________________________________");

    }

    }