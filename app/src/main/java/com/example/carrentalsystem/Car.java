package com.example.carrentalsystem;

public class Car {
    private int carID;
    private String brand;
    private String color;
    private String model;
    private double price;
    private String statusNumber;
    private int status;

    public Car() {
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.price = price;
        this.statusNumber = statusNumber;
        this.status = status;
    }
    public Car(int carID, String brand, String color, String model, double price, String statusNumber, int status) {
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.price = price;
        this.statusNumber = statusNumber;
        this.status = status;
    }


    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatusNumber() {
        return statusNumber;
    }

    public void setStatusNumber(String statusNumber) {
        this.statusNumber = statusNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public void updateStatus(int status) {
        this.status = status;
    }

}

