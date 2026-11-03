package org.example;


public class Main {
    public static void main(String[] args)  throws CloneNotSupportedException {

        System.out.println("________________________________________________");

        Person p1 = new Person("Ali", new Address("Cairo"));
        Person p2 = new Person(p1); // deep copy
        Person p3 = p1 ; // shalow copy



        System.out.println(p1==p2);
        System.out.println(p1==p3);
        System.out.println("________________________________________________");

        p2.address.city = "Alex";
        p2.name= "Mohamed";
        p3 . name = "ali2";

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


        p3 . name = "ali2";

        System.out.println("________________________________________________");




    }
}