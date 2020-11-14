package org.apache.struts.assignment2.model;
import java.sql.*;  
import java.util.HashMap;

public class User {
    private String email;
    private String password;
    private HashMap<String, String> users;

    public User (String email, String password) {
        this.email = email;
        this.password = password;
        this.users = new HashMap<String, String>();
    }
    
    public boolean isRegistered () {
        readDb();
        String password;
        try {
            password = users.get(this.email);
            // if user is in database
            if (this.password.equals(password)) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return false;
    }

    private void readDb() {
        String email= "";
        String password = "";
        try {  
            // change this to run on your localhost
            String userdb = "root";
            String passworddb = "Covid1920";

            String url = "jdbc:mysql://localhost:3306/cz3002?user="+userdb+"&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
            // String url = "jdbc:mysql://localhost:3306/cz3002?autoReconnect=true&useSSL=false";
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con = DriverManager.getConnection(  
                url, userdb, passworddb);    
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from user");  
            while(rs.next()) {
                email = rs.getString(1);
                password = rs.getString(2);
                users.put(email, password);
            }
            con.close();  
        } catch (Exception e) { 
            System.out.println(e);
        }  
    }

    public String getEmail () {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
}