package org.apache.struts.assignment2.model;

public class User {
    private String email;
    private String password;

    public User (String email, String password) {
        System.out.print(email);
        this.email = email;
        this.password = password;
    }
    
    public boolean isRegistered () {
        return true;
    }
}