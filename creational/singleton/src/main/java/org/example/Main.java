package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("___________________________________");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        System.out.println(obj1 == obj2);
        System.out.println("___________________________________");



    }
}