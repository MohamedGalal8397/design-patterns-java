package org.example;

public class Person implements Cloneable{

    String name;
    Address address;

    public Person() {
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }


    public Person(Person other) {
        this.name = other.name; // String immutable → مش محتاج نسخة
        this.address = new Address(other.address.city); // نسخة جديدة من Address
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address.city + '}';
    }
}
