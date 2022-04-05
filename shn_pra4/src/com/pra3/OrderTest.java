package com.pra3;

import javax.management.OperationsException;

public class OrderTest {
    public static void main(String[] args) {
        Order o1=new Order(1001,"AA");
        Order o2=new Order(1001,"AA");
        System.out.println(o1.equals(o2));
    }
}
class Order{
    private int orderId;
    private String orderName;
    public int getOrderId(){
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    public Order(int orderId,String orderName){
        super();
        this.orderId=orderId;
        this.orderName=orderName;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj instanceof Order){
            Order order=(Order) obj;
            return this.orderName.equals(order.orderName)&&this.orderId==order.orderId;
        }
        return false;
    }
}
