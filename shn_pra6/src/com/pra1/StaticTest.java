package com.pra1;

/**
 * static关键字的使用
 * 1。static:静态的
 * 2。static可以用来修饰方法，属性，代码块，内部类
 *
 * 3、使用static修饰属性，静态变量
 *      3，1属性：按是否使用static修饰，又分为：静态属性 vs 非静态属性（实列变量）
 *        实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性，当修改其中一个对象中的
 *              非静态属性时，不会导致其他对象中同样的属性值的修改
 *        静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量，当通过某一个对象修改静态变量时，会导致
 *              其他对象调用此静态变量时，是修改过了的。
 *      3.2static修饰属性的其他说明：
 *          ①静态变量随着类的加载而加载，可以通过“类。静态变量”的方式进行调用
 *          ②静态变量的加载要早于对象的创建
 *          ③由于类只会加载一次，则静态变量在内存中也只会加载一次，存在方法区的静态域中
 *          ④       类变量       实例变量
 *          类         yes        no
 *          对象        yes        yes
 *      3.3静态属性举例，System.out;Math.PI;
 *
 * 4.使用static修饰方法，静态方法
 *      ①随着类的页面加载，可以通过“类、静态方法"的方式进行使用
 *      ②        静态方法         非静态方法
 *         类       yes             no
 *         对象      yew            yes
 *      ③静态方法中，只能调用静态的方法或属性
 *       非静态方法中，既可以调用非静态的方法和属性，也可以调用静态的方法和属性
 * 5.static注意到：
 *    在静态的方法内，不能使用this，super关键字
 * 6.开发中，如何确定一个属性是否声明为static的？
 *      属性可以被多个对象所共享的，不会随着对象的不同而不同的
 *
 *
 *   可发中，如何确定一格方法是否要声明为static的？
 *      操作静态属性的方法，通常设置为static的
 *      工具类的方法，习惯上声明为static的。比如：Math,Arrays,Collections
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese c1=new Chinese();
        c1.age=40;
        c1.name="姚明";
        c1.nation="CHN";

        Chinese c2=new Chinese();
        c2.name="马龙";
        c2.age=30;
        c2.nation="CHINESE";

        System.out.println(c1.nation);
        c1.eat();
    }
}

class Chinese{
    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("中国人吃中餐");
        walk();
    }

    public static void show(){
        System.out.println("我是一个中国人");
        System.out.println(Chinese.nation);
    }

    public static void walk(){
        System.out.println("人会走路");
    }
}
