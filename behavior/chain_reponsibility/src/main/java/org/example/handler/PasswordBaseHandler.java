package org.example.handler;

public class PasswordBaseHandler extends BaseHandler {
    @Override
    protected boolean doHandle(String username, String password) {

        if (!"12345".equals(password)) {
            System.out.println("❌ Invalid password!");
            return false;
        }
        System.out.println("✅ Password is correct");
        return true;
    }
}
