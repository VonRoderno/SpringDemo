package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class UserSession {
    private String username;
    private String check_taken = "false";
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getCheck_taken() {
        return check_taken;
    }
    public void setCheck_taken(String check_taken) {
        this.check_taken = check_taken;
    }
}
