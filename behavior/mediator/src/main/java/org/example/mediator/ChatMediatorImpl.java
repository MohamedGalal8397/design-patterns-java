package org.example.mediator;

import org.example.user.User;
import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, User sender) {
        for (User u : users) {
            if (u != sender) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
