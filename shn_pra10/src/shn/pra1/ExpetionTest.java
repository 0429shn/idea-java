package shn.pra1;

import org.testng.annotations.Test;

/***
 * 异常处理抓抛模型
 *
 * 过程1：“抛”，程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象
 *            并将此异常抛出
 * 过程2：“抓”：可以理解为异常的处理方式
 *
 * 二。
 */
public class ExpetionTest {

    public static void main(String[] args) {


        try{
            int a=10;
            int b=0;
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("我好帅啊");
        }
    }

}
