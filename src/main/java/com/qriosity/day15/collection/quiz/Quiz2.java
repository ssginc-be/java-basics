package com.qriosity.day15.collection.quiz;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Queue-ri
 */
public class Quiz2 {
    public static void main(String[] args) {
        //list
        LinkedList list = new LinkedList();
        list.add("수업듣기");
        list.add("문제풀기");
        list.add("밥먹기");
        list.add("오후수업");
        list.add("문제풀기2");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Object x: list){
            System.out.println(x);
        }
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
