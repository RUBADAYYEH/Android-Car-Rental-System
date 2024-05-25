package com.example.carrentalsystem;

import java.util.Date;

public class Contract {
    private int contractID;
    private String username;
    private int carID;
    private Date startDate;
    private Date endDate;
    private double price;
    private int status;
    private int paymentMethod;

    public Contract() {
        this.contractID = contractID;
        this.username = username;
        this.carID = carID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }
    public Contract(int contractID, String username, int carID, Date startDate, Date endDate, double price, int status, int paymentMethod) {
        this.contractID = contractID;
        this.username = username;
        this.carID = carID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
