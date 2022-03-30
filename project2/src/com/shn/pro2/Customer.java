package com.shn.pro2;
/**
 *
 */
public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    public Customer(String name,char gender,int age,String phone,String email){
        this.name=name;
        this.age=age;
        this.email=email;
        this.gender=gender;
        this.phone=phone;
    }
}
