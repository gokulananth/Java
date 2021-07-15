package com.example.demo.home;


public class User {
    private String username;
    private int status;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", status=" + status +
                ", password='" + password + '\'' +
                '}';
    }

    private String password;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
