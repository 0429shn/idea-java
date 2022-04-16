package com.shn.pra1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee manger=new Manger("库克",1001,500,new MyDate(100,10,10));
        //manger.work();
        Employee em=new CommonEmployee();
        //em.work();
    }
}
