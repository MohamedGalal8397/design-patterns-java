package org.example.handler;

public class UserExistsBaseHandler extends BaseHandler {
    @Override
    protected boolean doHandle(String username, String password) {

            if (!"mohamed".equals(username)) {
                System.out.println("❌ User not found!");
                return false;
            }
            System.out.println("✅ User exists");
            return true;
    }
}
