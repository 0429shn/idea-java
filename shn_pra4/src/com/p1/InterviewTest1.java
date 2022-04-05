package com.p1;

public class InterviewTest1 {
    public static void main(String[] args) {
        Base1 base =new Sub1();
        base.add(1,2,3);//被认为是重写
        Sub1 s=(Sub1)base;
        s.add(1,2,3);//sun2确定组合优先调用
    }
}
class Base1{
    public void add(int a,int... arr){
        System.out.println("base1");
    }
}

class Sub1 extends Base1{
    public void add(int a,int []arr){
        System.out.println("sub_1");
    }
    public void add(int a,int b,int c){
        System.out.println("sub_2");
    }
}
