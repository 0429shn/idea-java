package com.shn.pra1;

public class Manger extends Employee {
    private double bonus;
    public Manger(double bonus){
        super();
        this.bonus=bonus;
    }
    public Manger(String name,int id,double salary,MyDate bonus){
        super(name,id,bonus);
        //this.;
        //this.Manger(bonus);
    }
    public void work() {
        System.out.println("管理员工，提供公司的运行方法");
    }

    @Override
    public double earnings() {
        return 0;
    }
}
