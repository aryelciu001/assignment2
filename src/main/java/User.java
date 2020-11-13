package org.apache.struts.assignment2.model;

public class User {
    private String email;
    private String password;

    public User (String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public boolean isRegistered () {
        // if user is in database
        return true;
    }

    public String getEmail () {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
}