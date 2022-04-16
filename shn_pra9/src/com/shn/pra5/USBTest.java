package com.shn.pra5;

/**
 * 接口的使用符合多态性
 */
public class USBTest {
    public static void main(String[] args) {
        Computer com=new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash=new Flash();
        com.transferData(flash);
        //2.创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());
        //3.创建了接口的匿名实现类的非匿名对象
        USB phone=new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void end() {
                System.out.println("手机结束工作");
            }
        };
        com.transferData(phone);
        //4.创建了接口的匿名实现类的匿名对象
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void end() {
                System.out.println("mp3结束工作");
            }
        });
    }
}
class Computer{
    public void transferData(USB usb){
        usb.start();
        System.out.println("具体的传输细节");
        usb.end();
    }
}
interface USB{
    void start();
    void end();
}
class Flash implements USB{
    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void end() {
        System.out.println("U盘结束工作");
    }

}
class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void end() {
        System.out.println("打印机结束工作");
    }
}

