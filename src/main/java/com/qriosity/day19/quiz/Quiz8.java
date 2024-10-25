package com.qriosity.day19.quiz;

import java.lang.reflect.Method;

/**
 * @author Queue-ri
 */
public class Quiz8 {
    // 심화문제 8번 - 리플렉션 문제
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("com.qriosity.day19.quiz.Person");
            Method[] mList = cls.getMethods();
            for (Method m : mList) {
                System.out.println("Method name: " + m.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    private void sayGoodbye() {
        System.out.println("Goodbye from " + name);
    }
}
