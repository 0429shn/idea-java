package com.pra4;

public class Student extends Person{
    protected String school="pku";

    protected String getInfo(){
        return "Name"+name+"\nage"+age+"\nschool"+school;
    }
}
