package shn.pra2;

public class Account {
    private int id;
    private String pwd="000000";
    private double balance;

    private static double interestRote;
    private static double minMoney=1.0;
    private static int init=1001;
    public Account(){
        id=init++;
    }
    public Account(String pwd,double balance){
        id=init++;
        this.pwd=pwd;
        this.id=id;
    }
    public int getId() {
        return id;
    }
    public static void setMinMoney(double minMoney){
        Account.minMoney=minMoney;
    }
    public String getPwd() {
        return pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRote() {
        return interestRote;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setInterestRote(double interestRote) {
        Account.interestRote = interestRote;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setId(int id) {
        this.id = id;
    }
}
