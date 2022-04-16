package com.shn.pra1;

public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;
    public Employee(){
        super();
    }
    public Employee(String name,int number,MyDate birthday){
        super();
        this.name=name;
        this.number=number;
        this.birthday=birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public MyDate getBirthday() {
        return birthday;
    }
    public abstract double earnings();
    public String toString(){
        return "Employee [name="+name+",number="+number+",birthday="+birthday+"]";
    }
}
