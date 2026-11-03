package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("__________________________________________________________________________________________________________");

        Person person = new PersonBuilder("Ali", "Mohamed")
                .age(25)
                .phone("01000000000")
                .address("Cairo")
                .build();

        System.out.println(person);
        System.out.println("__________________________________________________________________________________________________________");

    }
}