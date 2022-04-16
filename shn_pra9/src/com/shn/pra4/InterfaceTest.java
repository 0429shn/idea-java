package com.shn.pra4;

/**
 * 接口的使用
 * 1.接口使用interface来定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.如何定义接口，定义接口的成员
 *       3.1JDK7及以前，只能定义全局常量和抽象方法
 *          >全局常量：public static final的
 *          >抽象方法:public abstract的
 *       3.2JDK8，除了定义全局常量和抽象方法之外，还可以定义静态方法
 * 4.接口不能定义构造器，意味着接口不可以实例化
 * 5.Java开发中，接口通过让类去实现（implements）的方式来使用
 *      如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 *      如果实现类没有覆盖接口中所有的抽象方法，则实现类认为一个抽象类
 * 6.Java类可以实现多个接口
 *    class 类名 extends 父类 implements 接口名1，接口名2,...
 *  7.接口和接口之间可以多继承
 *  *********************************
 *  8.接口的使用能体现多态性
 *  9.接口实际上可以看作是一种规范
 *
 *  面试题：抽象类和接口有哪些异同？
 *
 */
public class InterfaceTest {

    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Plane plane=new Plane();
        plane.fly();
    }
}
interface Flyable{
    public static final int MAX_SPEED=7900;
    int MIN_SPEED=1;//省略了 public static final,还是全局常量
    public abstract void fly();
    void stop();//省略了 public abstract 还是抽象方法
}
interface Attack{
    void attack();
}
class BUllet extends Object implements Flyable,Attack{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}

class Plane implements Flyable,CC {

    @Override
    public void fly() {
        System.out.println("飞机汇费");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{

}


