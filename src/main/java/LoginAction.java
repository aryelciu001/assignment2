package org.apache.struts.assignment2.action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.assignment2.model.User;

public class LoginAction extends ActionSupport {
    private String email;
    private String password;

    public String execute() throws Exception {
      User u = new User(this.email, this.password);
      if (u.isRegistered()) {
        return SUCCESS;
      }
      return SUCCESS;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public void setPassword(String password) {
      this.password = password;
    }
}