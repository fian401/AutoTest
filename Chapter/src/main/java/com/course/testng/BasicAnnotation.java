package com.course.testng;

import org.testng.annotations.*;

import java.sql.SQLOutput;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testcase1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.print("这是测试用例一");
    }
    @Test
    public void testcase2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.print("这是测试用例二");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.print("BeforMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.print("AfterMethod这是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.print("beforeClass这是在类运行之前运行");
    }
    @AfterClass
    public void afterClass(){
        System.out.print("afterClass这是在类运行之后运行");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.print("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.print("AfterSuite测试套件");
    }
}
