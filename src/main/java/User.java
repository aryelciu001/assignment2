package org.apache.struts.assignment2.model;

public class User {

    public static final String ERROR = "error";
    public static final String SUCCESS = "success";

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
}