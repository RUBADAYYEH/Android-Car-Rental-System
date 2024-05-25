package com.example.carrentalsystem;

public class PaymentMethod {
    private String username;
    private int visaID;
    private double balance;
    private double withdraw;
    private double deposit;

    public PaymentMethod(String username, int visaID, double balance, double withdraw, double deposit) {
        this.username = username;
        this.visaID = visaID;
        this.balance = balance;
        this.withdraw = withdraw;
        this.deposit = deposit;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getVisaID() {
        return visaID;
    }

    public void setVisaID(int visaID) {
        this.visaID = visaID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
