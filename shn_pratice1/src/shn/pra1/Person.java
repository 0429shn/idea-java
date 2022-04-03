package shn.pra1;

public class Person {
    String name;
    private int age;
    public Person(){
    }
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void eat(){
        System.out.println("人会吃饭！");
    }
    public void sleep(){
        System.out.println("人会睡觉！");
    }
    public void walk(int distance){
        System.out.println("走路，走的距离是"+distance+"公里");
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
