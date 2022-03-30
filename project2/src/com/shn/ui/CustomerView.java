package com.shn.ui;

import com.shn.pro2.Customer;
import com.shn.service.CustomerList;
import com.shn.util.CMUtility;

/**
 *
 */
public class CustomerView {
    private CustomerList customerList=new CustomerList(10);
    public void enterMainMenu(){
        boolean isFlag=true;
        while (isFlag) {
            System.out.println("\n-------------客户信息管理软件-------------");
            System.out.println("                  1 添加客户");
            System.out.println("                  2 修改客户");
            System.out.println("                  3 删除客户");
            System.out.println("                  4 客户列表");
            System.out.println("               请选择（1-5）：");

            char menu=CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.println("确认是否退出退出[Y/N]");
                    char isExit=CMUtility.readConfirmSelection();
                    if(isExit=='Y'){
                        isFlag=false;
                    }
                    //break;
            }
        }
    }
    private void addNewCustomer(){
        System.out.println("-----------------------添加客户--------------------");
        System.out.print("姓名：");
        String name=CMUtility.readString(10);
        System.out.print("性别：");
        char gender=CMUtility.readChar();
        System.out.println("年龄：");
        int age=CMUtility.readInt();
        System.out.println("电话：");
        String phone=CMUtility.readString(13);
        System.out.println("邮箱：");
        String email=CMUtility.readString(30);
        Customer customer=new Customer(name,gender,age,phone, email);
        boolean isSuccess=customerList.addCustomer(customer);
        if(isSuccess){
            System.out.println("-------------------添加完成-------------------");
        }
        else{
            System.out.println("-------------------添加失败--------------------");
        }
    }
    private void modifyCustomer(){
        System.out.println("----------------------修改客户---------------------");
        Customer cust;
        int number;
        for(;;){
            System.out.println("请选择修改客户编号（-1退出）：");
            number=CMUtility.readInt();
            if(number==-1){
                return;
            }
            cust =customerList.getCustommer(number-1);
            if(cust==null){
                System.out.println("无法找到指定客户！");
            }
            else {
                break;
            }
        }
        System.out.println("姓名（"+cust.getName()+");");
        String name=CMUtility.readString(10,cust.getName());
        System.out.println("性别（"+cust.getGender()+");");
        char gender=CMUtility.readChar(cust.getGender());
        System.out.println("年龄（"+cust.getAge()+");");
        int age=CMUtility.readInt(cust.getAge());
        System.out.println("电话（"+cust.getPhone()+");");
        String phone=CMUtility.readString(13,cust.getPhone());
        System.out.println("邮箱（"+cust.getEmail()+");");
        String email=CMUtility.readString(30,cust.getEmail());

        Customer newCust=new Customer(name,gender,age,phone,email);
        boolean isSuccess=customerList.replaceCustomer(number-1,newCust);

        if(isSuccess){
            System.out.println("-------------------修改完成-------------------");
        }
        else{
            System.out.println("-------------------修改失败--------------------");
        }
    }
    private void deleteCustomer(){
        System.out.println("----------------------删除客户---------------------");
        int number;
        for(;;) {
            System.out.println("请选择删除客户编号（-1退出）：");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            Customer customer = customerList.getCustommer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }
        System.out.print("确认是否删除（Y/N");
        char isDelete=CMUtility.readConfirmSelection();
        if(isDelete=='Y'){
            boolean deleteSuccess=customerList.deleteCustomer(number-1);
            if (deleteSuccess){
                System.out.println("-------------------删除完成-------------------");
            }
            else{
                System.out.println("-------------------删除失败--------------------");
            }
        }
        else
        {
            return;
        }


    }
    private void listAllCustomer(){
        System.out.println("----------------------客户列表---------------------");
        int total=customerList.getTotal();
        if(total==0){
            System.out.println("没有客户信息");
        }
        else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer []cuts=customerList.getAllCustomers();
            for (int i=0;i<cuts.length;i++){
                Customer cust=cuts[i];
                System.out.println((i+1)+"\t"+cust.getName()+
                        "\t"+cust.getGender()+"\t"+cust.getAge()+"\t"+cust.getPhone()+"\t"+cust.getEmail());

            }
        }
        System.out.println("----------------------列表完成---------------------");
    }
    public static void main(String[] args) {
        CustomerView view=new CustomerView();
                view.enterMainMenu();
    }
}
