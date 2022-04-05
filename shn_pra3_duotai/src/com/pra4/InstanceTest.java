package com.pra4;

public class InstanceTest {
    public void method(Person e){
        //看左边根instanceof的右边谁更高级，右边比左边高级则不会输出
        if(e instanceof Graduate){
            System.out.println("a graduated student");
        }
        if(e instanceof Student){
            System.out.println("a student");
        }
        if(e instanceof Person){
            System.out.println("a person");
        }
    }
    public static void main(String[] args) {
        InstanceTest in=new InstanceTest();
        in.method(new Graduate());
        in.method(new Student());
    }
}
