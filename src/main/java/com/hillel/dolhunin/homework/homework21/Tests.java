package com.hillel.dolhunin.homework.homework21;

import com.hillel.dolhunin.homework.homework21.anotation.AfterSuite;
import com.hillel.dolhunin.homework.homework21.anotation.BeforeSuite;
import com.hillel.dolhunin.homework.homework21.anotation.Test;


public class Tests {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @Test(priority = 3)
    public void test3() {
        System.out.println("test3");
    }

    @Test(priority = 1)
    public void test1() {
        System.out.println("test1");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("test2");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }

}
