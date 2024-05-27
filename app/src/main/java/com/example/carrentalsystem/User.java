package com.example.carrentalsystem;

public abstract class User {
    private String username;
    private String password;
    private int token;

    public User() {
        this.username = username;
        this.password = password;
        this.token = token;
    }
    public User(String username, String password, int token) {
        this.username = username;
        this.password = password;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }
    public abstract void activateApp();

}

