package com.shn.pra1;

public class OrderTest {
    public static void main(String[] args) {
        Order order=new Order();
        System.out.println(order.orderId);
    }
}
class Order{
    int orderId=3;

    {
        orderId=4;
    }

    public Order(){
        this.orderId=5;
    }
}
