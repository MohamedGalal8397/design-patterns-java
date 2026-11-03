package org.example;


import org.example.mediator.ChatMediator;
import org.example.mediator.ChatMediatorImpl;
import org.example.user.ChatUser;
import org.example.user.User;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User u1 = new ChatUser(mediator, "Mohamed");
        User u2 = new ChatUser(mediator, "Omar");
        User u3 = new ChatUser(mediator, "Sara");

        mediator.addUser(u1);
        mediator.addUser(u2);
        mediator.addUser(u3);

        u1.send("Hello everyone!");
    }
}