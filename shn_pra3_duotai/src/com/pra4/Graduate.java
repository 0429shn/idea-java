package com.pra4;

public class Graduate extends Student{
    protected String major ="IT";
    protected String getInfo(){
        return "Name:"+name+"\nage:"+age+"\nschool"+school+"\nmajor"+major;
    }
}
