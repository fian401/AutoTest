package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.rmi.server.ObjID;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.print("name =" + name +";  age =" + age);
    }
    @DataProvider(name="data")
    public Object[][] provideData(){
        Object[][] o = new Object[][]{
                {"张三",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    };

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.print("name =" + name +";  age =" + age + "test1方法");
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.print("name =" + name +";  age =" + age + "test2方法");
    }
    @DataProvider(name ="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null ;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsna",10},
                    {"lisi",25}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }
        return result;
    }
}
