package com.qriosity.day15.collection;

import java.util.HashSet;
import java.util.Random;

/**
 * @author Queue-ri
 */
public class SetTest {
    public static void main(String[] args) {
        //로또 중복되지 않은 값 6개, 랜덤하게.
        Random r = new Random();
        HashSet lotto = new HashSet();

        while (true) {
            int data = r.nextInt(45) + 1; //1~45
            lotto.add(data);
            if(lotto.size() == 6){
                break;
            }
        }
        System.out.println(lotto);
    }
}
