package org.example;


public class PersonBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    public PersonBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(this);
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
}
