package com.example.carrentalsystem;

public class Customer extends User {
    private String phone;
    private String location;
    private String license;


    public Customer(String username, String password, int token, String phone, String location, String license) {
        super(username, password, token);
        this.phone = phone;
        this.location = location;
        this.license = license;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
    @Override
    public void activateApp() {
    }
}
