package org.example;


import org.example.handler.BaseHandler;
import org.example.handler.PasswordBaseHandler;
import org.example.handler.RoleBaseHandler;
import org.example.handler.UserExistsBaseHandler;



public class Main {
    public static void main(String[] args) {

        BaseHandler handler = new UserExistsBaseHandler();
        handler.setNext(new PasswordBaseHandler())
                .setNext(new RoleBaseHandler());

        // test1 : valid user
        System.out.println("----- Test 1 -----");
        handler.handle("mohamed", "12345");


        // test2 : wrong password
        System.out.println("----- Test 2 -----");
        handler.handle("mohamed", "0000");

        // test3: invalid username
        System.out.println("----- Test 3 -----");
        handler.handle("ahmed", "12345");


    }
}