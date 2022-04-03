package com.acc;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account(int id ,double balance,double annuallnterestRate){
        this.annualInterestRate=annuallnterestRate;
        this.id=id;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }
    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setId(int id){
        this.id=id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annuallnterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyinterest(){
        return annualInterestRate / 12;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance=-amount;
            return;
        }
        System.out.println("余额不足");
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
}
