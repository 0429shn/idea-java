package com.shn.service;

import com.shn.pro2.Customer;
import com.shn.ui.CustomerView;

/**
 *
 */
public class CustomerList {
    private Customer[] customers;
    private int total=0;
    public CustomerList(int totalCustomer){
        customers=new Customer[totalCustomer];
    }

    /**
     * 将指定客户添加到数组中
     * @param customer
     * @return
     */
    public boolean addCustomer(Customer customer){
        if(total>=customers.length){
            return false;
        }
        customers[total++]=customer;
        return true;
    }

    /**
     * 修改指定位置上的客户信息
     * @param index
     * @param cust
     * @return
     */
    public boolean replaceCustomer(int index,Customer cust){
        if(index<0||index>=total){
            return false;
        }
        customers[index]=cust;
        return true;
    }

    /**
     * 删除指定位置上的客户
     * @param index
     * @return
     */
    public boolean deleteCustomer(int index){
        if(index<0||index>=total){
            return false;
        }
        for (int i=index;i<total-1;i++){
            customers[i]=customers[i+1];
        }
        customers[--total]=null;
        return true;
    }
    /**
     * 获取所有的客户信息
     */
    public Customer[] getAllCustomers(){
        Customer[] custs=new Customer[total];
        for(int i=0;i<total;i++){
            custs[i]=customers[i];
        }
        return custs;
    }
    /**
     * 获取指定索引上的客户
     */
    public Customer getCustommer(int index){
        if(index<0||index>=total){
            return null;
        }
        return customers[index];
    }
    /**
     * 获取客户数量
     */
    public int getTotal(){
        return total;
    }
}
