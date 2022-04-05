package com.shn1;

public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s=new Sub();
        System.out.println(s.count);
        s.display();
        Base b=s;
        System.out.println(b==s);//true
        System.out.println(b.count);//10 多态性不适用于属性
        b.display();//20
        Base b2=new Sub();
        b2.display();
        System.out.println(b2.count);

    }
}
