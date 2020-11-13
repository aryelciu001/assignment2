package org.apache.struts.assignment2.action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.assignment2.model.User;

public class LoginAction extends ActionSupport {
    private String email;
    private String password;
    private User user;

    public String execute() throws Exception {
      user = new User(this.email, this.password);
      if (user.isRegistered()) {
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

    public User getUser() {
      return this.user;
    }
}