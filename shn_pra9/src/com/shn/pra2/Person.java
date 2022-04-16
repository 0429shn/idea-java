package com.shn.pra2;

public abstract class Person {
    String name;
    int age;
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public abstract void eat();
    public abstract void breath();
    public void walk(){
        System.out.println("人走路");
    }
}
class Student extends Person{
    public Student(String name,int age){
        super(name,age);
    }
    public Student(){
        super();
    }
    @Override
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }
    public void breath(){
        System.out.println("学生应该呼吸新鲜的没有雾霾的空气");
    }
}
