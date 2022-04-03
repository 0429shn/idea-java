package shn.pra1;

public class Student extends Person{
    //String name;
    //int age;
    String major;
    public Student(){

    }
    public Student(String major){
        this.major=major;
    }
    public Student(String major,String name,int age){
        setAge(age);
        this.major=major;
        this.name=name;
    }
    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }
    //public void eat(){
     //   System.out.println("人会吃饭！");
    //}
    //public void sleep(){
        //System.out.println("人会睡觉！");
   //}
    public void study(){
        System.out.println("人会学习！");
    }
    public void show(){
        System.out.println("name:"+this.name+",age:"+getAge());
    }
}
