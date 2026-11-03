package org.example;

public class Employee implements Prototype {

    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public Prototype clone() {
        return new Employee(name, position);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', position='" + position + "'}";
    }
}
