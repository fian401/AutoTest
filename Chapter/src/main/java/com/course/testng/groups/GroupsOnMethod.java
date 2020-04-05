package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class GroupsOnMethod {
    //方法分组
    @Test(groups = "server")
    public void test1(){
        System.out.print("这是服务端测试方法111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.print("这是服务端测试方法222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.print("这是客户端测试方法333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.print("这是客户端测试方法444");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.print("这是服务端组运行之前的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.print("这是服务端组运行之后的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnclient(){
        System.out.print("这是客户端组运行之前的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnclient(){
        System.out.print("这是客户端组运行之后的方法");
    }
}
