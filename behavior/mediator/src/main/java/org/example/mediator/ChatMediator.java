package org.example.mediator;

import org.example.user.User;

public interface ChatMediator {

    void sendMessage(String msg, User user);
    void addUser(User user);

}
