package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    //失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.print("这是一个失败的异常测试");
    }
    //成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.print("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
