package com.shn.pra2;

public class PersonTest {
    public static void main(String[] args) {
        method(new Student());
        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("快点吃");
            }

            @Override
            public void breath() {
                System.out.println("呼吸新鲜空气");
            }
        });
    }
    public static void method(Student s){

    }
    public static void method1(Person p){
        p.eat();
        p.breath();
    }
}
