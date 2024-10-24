package com.qriosity.day18.design_pattern;

/**
 * @author Queue-ri
 */
public class ObjectInitFactoryClass {
    public Object getInstance(String name) {
        if (name.equalsIgnoreCase("apple")) { // 대소문자 무시하는 비교함수
            return new AClass();
        }
        else if (name.equalsIgnoreCase("banana")) {
            return new BClass();
        }
        else {
            return null;
        }
    }
}
