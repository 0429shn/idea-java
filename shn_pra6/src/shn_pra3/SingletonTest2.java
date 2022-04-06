package shn_pra3;

import javax.management.OperationsException;

/**
 * 饿汉式：
 *      好处：饿汉式是线程安全的
 *      坏处:对象加载时间过长
 * 懒汉式：
 *      好处:延迟对象的创建
 *      坏处：线程不安全----->到多线程内容时，在修改
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order o1=Order.getInstance();
        Order o2=Order.getInstance();
        System.out.println(o1==o2);
    }
}
//懒汉式
class Order{
    //私有化构造器
    private Order(){

    }
    //声明当前对象，没有初始化
    //此对象必须声明为static
    private static Order instance=null;
    //声明public、static的当前类对象的方法
    public static Order getInstance(){
        if(instance==null)
        instance=new Order();
        return instance;
    }
}
