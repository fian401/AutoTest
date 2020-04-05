package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.print("GroupsOnClass1中的11111运行");
    }
    public void stu2(){
        System.out.print("GroupsOnClass1中的22222运行");
    }
}
