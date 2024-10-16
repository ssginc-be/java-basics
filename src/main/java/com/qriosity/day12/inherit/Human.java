package com.qriosity.day12.inherit;

/**
 * @author Queue-ri
 */
public class Human {
    char gender;
    String name;

    public Human(char gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    public void sleep(){
        System.out.println("잠자는 중.");
    }

    public void eat(){
        System.out.println("먹는 중.");
    }
}
