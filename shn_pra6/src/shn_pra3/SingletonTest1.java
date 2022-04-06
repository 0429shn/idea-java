package shn_pra3;

public class SingletonTest1 {
    public static void main(String[] args) {
        //Bank bank1=new Bank();
        Bank b1=Bank.getInstance();
        Bank b2=Bank.getInstance();
        System.out.println(b1==b2);
    }
}
//饿汉式
class Bank{
    //私有化类的构造器
    private Bank(){

    }
    //内部创建类的对象
    //此对象也必须是static
    private static Bank instance=new Bank();
    //提供公共方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
