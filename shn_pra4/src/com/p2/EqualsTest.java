package com.p2;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * ==:运算符
 * 1。可以使用在基本数据类型变量和引用数据变量中
 * 2。如果比较的是基本数据类型变量，比较两个变量保存的数据是否相等。（不一定类型要相同）
 *    如果比较的是引用数据类型变量，比较两个对象的地址值是否相同
 * equals()方法
 * 1.是一个方法，而非运算符
 * 2.只能适用于引用数据类型
 * 3.Object类中equals()的定义：
 *   public boolean equals(Object obj){
 *       return (this==obj);
 *   }
 *   说明：Object类中定义的方法和==的作用是相同的,比较两个对象的地址值是否相等
 * 4.像String.Date.File.包装类等都重写了Object类中的equals()方法，重写以后比较的不是两个
 *   引用地址是否相同，而是比较两个对象的“实体内容是否相同
 */
public class EqualsTest {
    public static void main(String[] args) {
        int i=10;
        int j=10;
        double d=10.0;
        System.out.println(i==j);//true
        System.out.println(i==d);//true
        boolean b=true;
        //System.out.println(i==b);
        char c=10;
        System.out.println(c==i);//true
        char c1='A';
        char c2=65;
        System.out.println(c1==c2);//true

        Customer cust1=new Customer("Tom",10);
        Customer cust2=new Customer("Tom",10);
        System.out.println(cust2==cust1);//false

        String s1=new String("shn");
        String s2=new String("shn");
        System.out.println(s2==s1);//false

        System.out.println(cust1.equals(cust2));//false
        System.out.println(s1.equals(s2));//true

        Date d1=new Date(32421312122L);
        Date d2=new Date(32421312122L);
        System.out.println(d1.equals(d2));//true
    }
}
