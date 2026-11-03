package org.example;


public class Main {
    public static void main(String[] args) {


        Employee original = new Employee("Ali", "Developer");


        Employee copy = (Employee) original.clone();

        System.out.println(original == copy); // false → نسخة جديدة

        copy.setName("Mohamed");
        System.out.println(original); 
        System.out.println(copy);


        System.out.println(original == copy); // false → نسخة جديدة
    }
}