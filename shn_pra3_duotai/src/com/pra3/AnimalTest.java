package com.pra3;
//对象的多态性只适用于方法不适用于属性
public class AnimalTest {
    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
    public static void main(String[] args) {
        AnimalTest test=new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }
}
