package org.example.handler;

public abstract class BaseHandler {
    private BaseHandler nextBaseHandler;

    public BaseHandler setNext(BaseHandler nextBaseHandler) {
        this.nextBaseHandler = nextBaseHandler;
        return nextBaseHandler;

    }


    public void handle(String username, String password) {
        if (doHandle(username, password)) {
            if (nextBaseHandler != null) {
                nextBaseHandler.handle(username, password);
            }
        }
    }

    // each handler do different logic
    protected abstract boolean doHandle(String username, String password);
}
