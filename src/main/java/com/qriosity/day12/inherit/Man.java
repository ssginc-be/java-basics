package com.qriosity.day12.inherit;

/**
 * @author Queue-ri
 */
public class Man extends Human {
    int power;

    public Man(char gender, String name, int power) {
        //super()항상 맨 첫줄에 써야함.!
        super(gender, name);
        this.power = power;
    }

    //public Man(){
    // super(); //상속받는 클래스에서 생성자 호출시
    //부모객체부터 먼저 만들어야 파생이 되므로
    //부모 클래스의 생성자부터 먼저 호출해야함.
    // }

    public void run(){
        System.out.println("빨리 달리다.");
    }
}
