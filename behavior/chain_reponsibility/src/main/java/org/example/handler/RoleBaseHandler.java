package org.example.handler;

public class RoleBaseHandler extends BaseHandler {
    @Override
    protected boolean doHandle(String username, String password) {

            System.out.println("✅ Role is Admin");
            return true;
    }
}
