package com.shn.pra1;

public class SalaryiedEmployee extends Employee{
    private double monthlySalary;
    public SalaryiedEmployee(String name,int number,MyDate birthday){
        super(name,number,birthday);
    }
    @Override
    public double earnings() {
        return monthlySalary;
    }

}
