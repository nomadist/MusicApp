package business;


import java.io.Serializable;

public class User implements Serializable {

    User() {
        username = "";
        password = "";
    }

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String username;
    String password;

}
