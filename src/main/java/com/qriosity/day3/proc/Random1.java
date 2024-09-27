package com.qriosity.day3.proc;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10); // bound 안주면 +-21억(int) 범위에서 뽑음
        System.out.println(num);
    }
}
