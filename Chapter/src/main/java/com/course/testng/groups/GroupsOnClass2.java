package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.print("GroupsOnClass222中的11111运行");
    }
    public void stu2(){
        System.out.print("GroupsOnClass2222中的22222运行");
    }
}
