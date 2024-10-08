package com.qriosity.day7.oop;

/**
 * @author Queue-ri
 */
public class LivingRoom {
    public static void main(String[] args) {
        Television myTv = new Television();
        Television yourTv = new Television();
        //메서드는 생성된 객체의 주소만 있으면 된다.!
        myTv.changeCh();
        yourTv.changeCh();
        myTv.ch = 7;
        myTv.vol = 9;
        myTv.onOff = true;

        yourTv.ch = 9;
        yourTv.vol = 12;
        yourTv.onOff = true;

        Television tv = new Television();
        tv.powerOn();
        //tv.changeCh();
        tv.powerOff();

        System.out.println(tv.size);
        System.out.println(tv.price);

        tv.size = "small";
        tv.price = 10000;

        System.out.println(tv.size);
        System.out.println(tv.price);

        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog.name = "메리";
        dog.age = 5;

        dog2.name = "꾸숑";
        dog2.age = 6;

        System.out.println(dog.name + " " + dog.age);
        System.out.println(dog2.name + " " + dog2.age);

        dog.꼬리를흔들다();
        dog2.자다();

    }
}
