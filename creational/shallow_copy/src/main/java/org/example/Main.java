package org.example;


public class Main {
    public static void main(String[] args)  throws CloneNotSupportedException {

        System.out.println("________________________________________________");

        Person p1 = new Person("Ali", new Address("Cairo"));
        Person p2 = (Person) p1.clone();

        p2.address.city = "Alex";

        System.out.println(p1.address.city);
        System.out.println(p1==p2);

        System.out.println("________________________________________________");


    }
}