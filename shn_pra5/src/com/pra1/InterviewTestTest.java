package com.pra1;

import static org.junit.jupiter.api.Assertions.*;

/****
 * 关于包装类使用的面试题
 */
class InterviewTestTest {

    @org.junit.jupiter.api.Test
    void test1() {
        //Object o1=true?new Integer(1):new Double(2.0);
        //o1=1.0
        System.out.println(1);
    }
    @org.junit.jupiter.api.Test
    void test2(){
        //Integer内部定义了IntegerCache结构，IntegerCase中定义了Integer[],
        //保存了-128~127范围内的整数，如果我们使用自动装箱的方式，给Integer赋值的范围在
        //-128~127范围内时，可以直接使用数组内的元素，不用再去new了
        Integer i=1;
        Integer j=1;
        System.out.println(i==j);
        Integer x=129;
        Integer y=129;
        System.out.println(x==y);
    }
}