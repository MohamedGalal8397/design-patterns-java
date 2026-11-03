package org.example;


public class Main {
    public static void main(String[] args) {
        Subject newspaper = new Subject();

        Observer user1 = new User("Mohamed");
        Observer user2 = new User("Ahmed");
        Observer user3 = new User("Sara");

        // subscribe user
        newspaper.attach(user1);
        newspaper.attach(user2);
        newspaper.attach(user3);
        System.out.println("______________________________________________________________________________________________");

        // new version
        newspaper.notifyObservers("New issue of the newspaper is available!");

        // remove user
        newspaper.detach(user2);
        System.out.println("______________________________________________________________________________________________");
        // new version
        newspaper.notifyObservers("Second issue is out now!");

    }
}