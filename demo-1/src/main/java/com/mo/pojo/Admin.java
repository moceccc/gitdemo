package com.mo.pojo;

public class Admin {
    private String username;

    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Admin() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}