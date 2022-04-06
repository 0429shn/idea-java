package com.pra1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle();
        Circle c3=new Circle(3.14);
        System.out.println("c1的ID:"+c1.getId());
        System.out.println("c2的ID:"+c2.getId());
        System.out.println("创建的圆的个数是："+Circle.getTotal());
        System.out.println(c3.findArea());
    }
}

class Circle{
    private double radius;
    private int id;
    private static int total;
    private static int init=1001;
    public Circle(){
        id=init++;
        total++;
    }
    public Circle(double radius){
        id=init++;
        total++;
        this.radius=radius;
    }
    public static int getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public double findArea(){
      return 3.14*radius*radius;
    }
}
