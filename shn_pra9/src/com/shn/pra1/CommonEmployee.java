package com.shn.pra1;

public class CommonEmployee extends Employee{


    public void work() {
        System.out.println("员工在一线车间工作");
    }

    @Override
    public double earnings() {
        return 0;
    }
}
