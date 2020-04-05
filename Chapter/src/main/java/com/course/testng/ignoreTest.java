package com.course.testng;

import org.testng.annotations.Test;

public class ignoreTest {
    @Test
    public void ignoreTest1(){
        System.out.print("ignoreTest1 测试被执行了");
    }
    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.print("ignoreTest2 测试被执行了");
    }
    @Test(enabled = true)
    public void ignoreTest3(){
        System.out.print("ignoreTest3 测试被执行了");
    }
}
