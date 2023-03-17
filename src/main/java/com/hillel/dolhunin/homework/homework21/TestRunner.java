package com.hillel.dolhunin.homework.homework21;


import com.hillel.dolhunin.homework.homework21.anotation.AfterSuite;
import com.hillel.dolhunin.homework.homework21.anotation.BeforeSuite;
import com.hillel.dolhunin.homework.homework21.anotation.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TestRunner {

    private static Object objects;
    private static List<Method> beforeSuiteMethod = new ArrayList<>();
    private static List<Method> testMethod = new ArrayList<>();
    private static List<Method> afterSuiteMethod = new ArrayList<>();
    public static void start(Class<?> clazz) throws Exception {

        objects = clazz.getDeclaredConstructor().newInstance();

        for(Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                beforeSuiteMethod.add(method);
            } else if (method.isAnnotationPresent(AfterSuite.class)) {
                afterSuiteMethod.add(method);
            } else if (method.isAnnotationPresent(Test.class)) {
                testMethod.add(method);
            }
        }

        if (beforeSuiteMethod.size() > 1) {
            throw new RuntimeException("Должен быть только 1 beforeSuiteMethod");
        }

        if (afterSuiteMethod.size() > 1) {
            throw new RuntimeException("Должен быть только 1 afterSuiteMethod");
        }

        testMethod.sort(Comparator.comparingInt(method -> method.getAnnotation(Test.class).priority()));

        if(beforeSuiteMethod.size() == 1) {
            beforeSuiteMethod.get(0).invoke(objects);
        }

        for(Method method : testMethod) {
            method.invoke(objects);
        }

        if (afterSuiteMethod.size() == 1) {
            afterSuiteMethod.get(0).invoke(objects);
        }

    }
}
