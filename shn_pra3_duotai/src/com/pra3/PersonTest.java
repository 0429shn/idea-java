package com.pra3;

public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.eat();

        Man man=new Man();
        man.eat();
        man.age=25;
        man.earnMoney();
        //对象的多态性，父类的引用指向子类的对象
        Person p2=new Man();
        Person p3=new Woman();
        //多态的使用，当调用子父类同名的参数的方法时，实际执行的是子类重写父类的方法-----虚拟方法调
        p2.eat();
        p2.walk();
        //有了对象的多态性以后，我们在编译器只能调用父类的中声明的方法，但在运行时，我们执行的是子类重写父类的方法
        //总结：编译看左边，运行看右边
        //多态性使用前提，①要有类的继承关系②方法的重写
        //p2.earnMoney();
    }
}
